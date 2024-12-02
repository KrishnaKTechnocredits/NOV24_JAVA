package imran.character_class_Program;

public class Assignment31_ReturnDiffSumOddEven {

	int even=0,odd=0;
	void getdata(String data)
	{
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			if(Character.isDigit(ch)== true)
			{
				int k = Character.getNumericValue(ch);
				if(k%2==0)
				{
					even= even+k;
				}
				else
				{
					odd = odd +k;
				}
			}
		}
		System.out.println("The Sum of all even digit present in a String : "+ data+ " is "+ even);
		System.out.println("The Sum of all odd digit present in a String : "+ data+ " is "+ odd);
	}
	
	void differ()
	{
		if(even>odd)
		{
			int diff= even-odd;
			System.out.println("The Difference of Sum of all the odd digits and even digits present in a given String is :" + diff);
		}
		else
		{
			int diff= odd-even;
			System.out.println("The Difference of Sum of all the odd digits and even digits present in a given String is :" + diff);
		}
	}
	
	public static void main(String[] args) {
		Assignment31_ReturnDiffSumOddEven assignment31_ReturnDiffSumOddEven_1 = new Assignment31_ReturnDiffSumOddEven();
		assignment31_ReturnDiffSumOddEven_1.getdata("te1ch2no3cre7dits");
		assignment31_ReturnDiffSumOddEven_1.differ();
		
		Assignment31_ReturnDiffSumOddEven assignment31_ReturnDiffSumOddEven_2 = new Assignment31_ReturnDiffSumOddEven();
		assignment31_ReturnDiffSumOddEven_2.getdata("4563");
		assignment31_ReturnDiffSumOddEven_2.differ();
		
	}
}
