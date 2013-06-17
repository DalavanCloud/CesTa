using System;
using System.Text;
using System.IO;
using System.Security.Cryptography;
using System.Windows.Forms;
using OnCardServerApp;

namespace CryptographyApplication
{
    /// <summary>
    /// Class Crypto provides methods for file encryption/decryption 
    /// and for computing file hash.
    /// </summary>
    [System.Diagnostics.DebuggerNonUserCodeAttribute()]
    class Crypto
    {
        private RijndaelManaged rijndael; // for encryption/decryption is used Rijndael cryptographic algorithm
        private CryptoService service; // this instance gives us access to running on card service

        /// <summary>
        /// Constructor for class Crypto.
        /// </summary>
        /// <param name="service">on card service</param>
        public Crypto(CryptoService service)
        {
            this.service = service; // initialize on card service
            rijndael = new RijndaelManaged(); // initialize Rijndael cryptographic algorithm
            rijndael.Mode = CipherMode.CBC; // set cipher mode to Cipher Block Chaining
            rijndael.Padding = PaddingMode.PKCS7; // set padding mode to PKCS7
        }

        /// <summary>
        /// Method encryptFile encrypts input file and the result saves to output file.
        /// </summary>
        /// <param name="inputFile">path to input file</param>
        /// <param name="outputFile">path to output file</param>
        /// <exception cref="ArgumentException">parameter inputFile is null or empty string</exception>
        /// <exception cref="ArgumentException">parameter outputFile is null or empty string</exception>
        /// <exception cref="Exception">encryption failed</exception>
        public void encryptFile(string inputFile, string outputFile)
        {
            if (inputFile.Equals("") || inputFile == null) throw new ArgumentException("Parameter inputFile is null or empty string.");
            if (outputFile.Equals("") || outputFile == null) throw new ArgumentException("Parameter outputFile is null or empty string.");

            FileStream fsOut = null; // output file stream

            try
            {
                fsOut = new FileStream(outputFile, FileMode.Create); // create output file
                DateTime date = DateTime.Now; // get todays date
                string dateToString = date.ToString("dd.MM.yyyy" + " " + "HH:mm:ss");

                rijndael.Key = service.generateKey(); // get the key, which is provided by on card service
                rijndael.IV = service.generateIV(); // get the IV, which is provided by on card service
                ICryptoTransform aesEncrypt = rijndael.CreateEncryptor(rijndael.Key, rijndael.IV); // create encryptor

                CryptoStream cs = new CryptoStream(fsOut, aesEncrypt, CryptoStreamMode.Write); // create CryptoStream
                FileStream fsIn = new FileStream(inputFile, FileMode.Open); // get access to input file

                int data;
                while ((data = fsIn.ReadByte()) != -1) // go throught the input file and do the encryption
                {
                    cs.WriteByte((byte)data);
                }

                fsIn.Close();
                cs.Close();
                fsOut.Close();

                string filename; 
                if (Path.GetFileNameWithoutExtension(outputFile).Length > 20) // check if the filename without extension has more than 20 characters
                {
                    filename = Path.GetFileNameWithoutExtension(outputFile).Substring(0, 20) + Path.GetExtension(outputFile);
                }
                else
                {
                    filename = Path.GetFileName(outputFile);
                }

                string[] record = { Convert.ToBase64String(rijndael.Key), Convert.ToBase64String(rijndael.IV), 
                    dateToString, filename }; // create record in format: key, IV, date, filename
                service.addRecord(Convert.ToBase64String(getFileHash(outputFile)), record); // send record to the smartcard
            }
            catch (Exception ex)
            {
                fsOut.Close(); // file ouput stream has to be closed, otherwise we cannot delete outputFile 
                File.Delete(outputFile); // outputFile is going to be deleted, when some exception is detected
                throw new Exception(ex.Message);
            }
        }

        /// <summary>
        /// Method decryptFile decrypts input file and the result saves to output file.
        /// </summary>
        /// <param name="inputFile">path to input file</param>
        /// <param name="outputFile">path to output file</param>
        /// <exception cref="ArgumentException">parameter inputFile is null or empty string</exception>
        /// <exception cref="ArgumentException">parameter outputFile is null or empty string</exception>
        /// <exception cref="Exception">decryption failed</exception>
        public void decryptFile(string inputFile, string outputFile)
        {
            if (inputFile.Equals("") || inputFile == null) throw new ArgumentException("Parameter inputFile is null or empty string.");
            if (outputFile.Equals("") || outputFile == null) throw new ArgumentException("Parameter outputFile is null or empty string.");

            FileStream fsOut = null; // output file stream

            try
            {
                fsOut = new FileStream(outputFile, FileMode.Create); // create output file
                string fileHash = Convert.ToBase64String(getFileHash(inputFile)); // compute file hash of input file
                string[] record = service.getRecord(fileHash); // get record, which is provided by on card service

                rijndael.Key = Convert.FromBase64String(record[0]); // get the key from record
                rijndael.IV = Convert.FromBase64String(record[1]); // get the IV from record
                ICryptoTransform aesDecrypt = rijndael.CreateDecryptor(rijndael.Key, rijndael.IV); // create decryptor

                FileStream fsIn = new FileStream(inputFile, FileMode.Open); // get access to input file
                CryptoStream cs = new CryptoStream(fsIn, aesDecrypt, CryptoStreamMode.Read); // create CryptoStream

                int data;
                while ((data = cs.ReadByte()) != -1) // go throught the encrypted file and do the decryption
                {
                    fsOut.WriteByte((byte)data);
                }

                cs.Close();
                fsIn.Close();
                fsOut.Close();
            }
            catch (Exception ex)
            {
                fsOut.Close(); // file ouput stream has to be closed, otherwise we cannot delete outputFile 
                File.Delete(outputFile); // outputFile is going to be deleted, when some exception is detected
                throw new Exception(ex.Message);
            }
        }

        /// <summary>
        /// Method getFileHash computes file hash of input file.
        /// </summary>
        /// <param name="inputFile">path to input file</param>
        /// <returns>computed file hash of input file</returns>
        /// <exception cref="ArgumentException">parameter inputFile is null or empty</exception>
        /// <exception cref="Exception">error occures during computing of file hash</exception>
        public byte[] getFileHash(string inputFile)
        {
            if (inputFile.Equals("") || inputFile == null) throw new ArgumentException("Parameter inputFile is null or empty string.");

            FileStream fs = null;
            HashAlgorithm hashAlg = null;

            try
            {
                fs = new FileStream(inputFile, FileMode.Open); // get access to input file
                hashAlg = new SHA512Managed(); // create instance of SHA512 Hash Algorithm

                byte[] fileHash = hashAlg.ComputeHash(fs); // compute and save the file hash

                fs.Close();

                return fileHash;
            }
            catch (Exception ex)
            {
                fs.Close(); // close file stream when error occures
                throw new Exception("Error occures during computing of file hash.", ex);
            }
        }
    }
}
