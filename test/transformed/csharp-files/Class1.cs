using System;

public class Class1
{
    private byte byteAttr;
    protected int intAttr = 1;
    public bool boolAttr;

    public Class1()
	{
        byteAttr = 2;
        byte localByte1, localByte2;
        localByte1 = 3;
        byte byteAttr = 4; // hides attr
        byteAttr++;
        for (int i = 0; i < 10; i++) {
            intAttr += i;
	    }
        }
}

