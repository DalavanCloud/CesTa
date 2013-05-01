using System;

public class Class1
{
    private byte number;

    public Class1()
	{
        number = 1;
        number++;
        if (number > 1)
        {
            number *= 2;
        }
        for (int i = 0; i < 10; i++)
        {
            number += 1;
        }
        Console.WriteLine(number);
	}
}
