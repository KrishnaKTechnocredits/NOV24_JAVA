package ravindra;

public class SumofDigitInString {
	
	int sumOfDigit(String name)
	{	int sum=0;
		for(int num=0;num<name.length();num++) 
		{
			char chars=name.charAt(num);
			if(Character.isDigit(chars))
			{
				int digit=Character.getNumericValue(chars);
				sum=sum+digit;
			}			
		}
		return sum;
	}
	
public static void main(String []args) {
	SumofDigitInString sumofDigitInString=new SumofDigitInString();
	int addition = sumofDigitInString.sumOfDigit("te1ch2no3cre7dits");
	System.out.println(addition);
	
	int add=sumofDigitInString.sumOfDigit("techno");
	System.out.println(add);
	
	int additions=sumofDigitInString.sumOfDigit("4563");
	System.out.println(additions);
	}
}
