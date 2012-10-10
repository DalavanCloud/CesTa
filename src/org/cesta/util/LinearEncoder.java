package org.cesta.util;

/**
 *  Linear encoder encodes numbers according to chosen simplified BCH
 *  polynomial code.
 *<p>
 *  CODE_15_7 matrix was constructed from polynomial
 *  G(x) = x^8+x^7+x^6+x^4+1 and generates (15,7) linear code, where each
 *  two codewords have Hamming distance at least 5. It has only 7 data bits,
 *  therefore it can encode only 128 different values.
 *</p>
 *<p>
 *  CODE_15_10 matrix was constructed from polynomial
 *  G(x) = x^5+x^3+x+1 and generates (15,10) linear code, where each
 *  two codewords have Hamming distance at least 4. It has 10 data bits.
 *</p>
 *<p>
 *  CODE_15_11 is (15,11) code and was constructed from G(x) = x^4+x+1.
 *  Hamming distance between codewords is at least 3. 11 data bits.
 *</p>
 *<p>
 *  CODE_15_14 is (15,14) code and was constructed from G(x) = x+1.
 *  Hamming distance between codewords is at least 2. 14 data bits.
 *</p>
 *<p>
 *  You can use Richard Tervo's online tool to see how the codes actualy look.
 *  <a href="http://www.ee.unb.ca/cgi-bin/tervo/polygen.pl">http://www.ee.unb.ca/cgi-bin/tervo/polygen.pl</a>
 *</p>
 *@author Tobias Smolka
 */
public class LinearEncoder {
    public static final int[][] CODE_15_7 = new int[][]{
        {1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1},
        {0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0},
        {0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1}
    };
    public static final int[][] CODE_15_10 = new int[][]{
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1},
        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1},
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1},
        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1}
    };
    public static final int[][] CODE_15_11 = new int[][]{
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1}
    };
    public static final int[][] CODE_15_14 = new int[][]{
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}
    };
    protected int[][] code = CODE_15_7;

    /**
     * Creates linear encoder, that can encode specified
     * number of words and guarantee some hamming distance
     * between each of them.
     *
     * Encoded number is always 15 bites long.
     *
     * @param wordCount number of possible words
     */
    public LinearEncoder(int wordCount){
        if (wordCount<0) throw new IllegalArgumentException("Number of words can't be negative.");

        if (wordCount<128) setCode(CODE_15_7);
        else if (wordCount<1024) setCode(CODE_15_10);
        else if (wordCount<2048) setCode(CODE_15_11);
        else if (wordCount<16384) setCode(CODE_15_14);
        else throw new IllegalArgumentException("Only less than 16384 words are supported.");
    }

    /**
     * Sets code for the encoder. The code is 2 dimensional array,
     * which contains generator matrix.
     * @param code
     */
    public void setCode(int[][] code){
        if (code==null || code.length==0)
            throw new IllegalArgumentException("Code is not valid");
        this.code = code;
    }
    /**
     * Returns currently used code (generator matrix)
     * @return code
     */
    public int[][] getCode(){
        return code;
    }
    /**
     * Encodes provided number
     * @param number
     * @return encoded number
     */
    public int encode(int number){
        int G[][] = getCode();
        int A[][] = int2matrix(number, G.length);
        int R[][] = multiplyMatrices(A,G);
        
        return matrix2int(R);
    }
    /**
     * Decodes provided number. The algorithm doesn't currently support
     * error correction.
     * @param number
     * @return decoded number
     */
    public int decode(int number){
        int G[][] = getCode();
        int A[][] = int2matrix(number, G[0].length);
        int B[][] = new int[1][G.length];
        // cut away parity bites
        for (int i=0;i<G.length;i++)
            B[0][i]=A[0][i];
        return matrix2int(B);
    }
    /**
     * Converts number to binary matrix with one row and bitLength columns
     * @param number number to convert
     * @param bitLength how big the matrix should be
     * @return matrix
     */
    public static int[][] int2matrix(int number, int bitLength) {
        int[][] result = new int[1][bitLength];
        int n = Math.abs(number);
        for (int i=bitLength-1;i>=0;i--){
            result[0][i]=n%2;
            n = n>>1;
        }
        return result;
    }
    /**
     * Converts binary row matrix to number
     * @param matrix matrix to convert
     * @return number
     */
    public static int matrix2int(int[][] matrix) {
        if (matrix.length!=1)
            throw new IllegalArgumentException("Matrix doesn't have exactly one row");
        int res = 0;
        int mult = 1;
        for (int i=matrix[0].length-1;i>=0;i--){
            res+=(matrix[0][i]%2)*mult;
            mult*=2;
        }
        return res;
    }
    /**
     * Multiply general matrices
     * @param m1 matrix A
     * @param m2 matrix B
     * @return matrix A*B
     */
    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int m1rows = m1.length;
        int m1cols = m1[0].length;
        int m2rows = m2.length;
        int m2cols = m2[0].length;
        if (m1cols != m2rows)
          throw new IllegalArgumentException("Matrices don't match: " + m1cols + " != " + m2rows);
        int[][] result = new int[m1rows][m2cols];

        for (int i=0; i<m1rows; i++)
          for (int j=0; j<m2cols; j++)
            for (int k=0; k<m1cols; k++)
            result[i][j] += m1[i][k] * m2[k][j];

        return result;
    }
    /**
     * Returns Hamming distance between two numbers
     * @param a non negative number
     * @param b non negative number
     * @return Hamming distance between a and b
     */
    public static int hammingDistance(int a, int b){
        int sum = 0;
        int diff = (a ^ b); // & 0xFFFF

        //if (diff<0){
        //    diff*=-diff;
        //    sum++;
        //}
        while (diff>0){
            sum += diff%2;
            diff = diff>>1;
        }
        return sum;
    }
}
