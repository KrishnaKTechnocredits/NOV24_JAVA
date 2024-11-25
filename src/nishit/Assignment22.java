package nishit;

public class Assignment22
{
	int countDigits(String input)
	{
        int digitCount = 0;

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            boolean isDigit = Character.isDigit(ch);
            if (isDigit)
            {
                digitCount++;
            }
        }
        System.out.println("Total " + digitCount + " digits are there in the given input.");
        return digitCount;
    }

    public static void main(String[] args)
    {
        Assignment22 assignment22 = new Assignment22();
        assignment22.countDigits("aa1kan33ks4h5a");
    }
}
