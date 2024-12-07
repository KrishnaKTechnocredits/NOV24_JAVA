package ravindra;

public class DiffOddEvenNum {
	int oddEven(String name) 	{
		int sumOfOdd=0;
		int sumofEven=0;
		for(int i=0;i<name.length();i++)
		{
			char chars=name.charAt(i);
			if(Character.isDigit(chars)) {
				int digit=Character.getNumericValue(chars);
				if(digit%2==1) {
					sumOfOdd=sumOfOdd+digit;
				}else {
					sumofEven=sumofEven+digit;
				}				
			}			
		}
		int diff=sumOfOdd-sumofEven;
		return diff;
	}
	
	public static void main(String[] args) {
		DiffOddEvenNum d=new DiffOddEvenNum();
		int str1=d.oddEven("te1ch2no3cre7dits");
		System.out.println(str1);
		
		int str2=d.oddEven("4563");
		System.out.println(str2);
	}
}
