package vrushali;

//Assignment - 22 : 25th Nov'2024 [20 mins]
//
//write a method to return total number of digits from the given input.
//print the count in main method.
//
//input : aa1kan33ks4h5a
//output : total 5 digits are there in given input.
//
//Hint : boolean Character.isDigit(ch)

public class FindDigitsInString {
	int getDigitsInString(String str)
	{
		int countDigit=0;
		char ch;
		
		for(int num=0;num<str.length();num++)
		{
			ch=str.charAt(num);
			if(Character.isDigit(ch))
			{
				countDigit++;
			}
		}
		return countDigit;
	}

	
	public static void main(String[] args) {
		
		FindDigitsInString findDigitsInString=new FindDigitsInString();
		int count=findDigitsInString.getDigitsInString("aa1kan33ks4h5a");
		System.out.println("Total "+count+" digits are in given input  ");
	}
}
