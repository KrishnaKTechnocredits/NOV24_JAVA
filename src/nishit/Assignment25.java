package nishit;

public class Assignment25
{
	int sum;

	void sumDigit(String str)
	{
		for (int i = 0; i <= str.length() - 1; i++)
		{
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
			{
				int digit = Character.getNumericValue(ch);
				sum = sum + digit;
				if (i == str.length() - 1)
				{
					break;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		Assignment25 assignment25_1 = new Assignment25();
		assignment25_1.sumDigit("te1ch2no3cre7dits");

		Assignment25 assignment25_2 = new Assignment25();
		assignment25_2.sumDigit("techno");

		Assignment25 assignment25_3 = new Assignment25();
		assignment25_3.sumDigit("4563");

	}
}
