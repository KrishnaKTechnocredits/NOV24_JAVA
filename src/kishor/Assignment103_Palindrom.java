package kishor;
//🔹 Assignment 103: Check for Palindrome
//📥 Input: naman, 1221
//✅ naman is a palindrome string
//✅ 1221 is a palindrome number
//❌ techno is not a palindrome string
//❌ 1211 is not a palindrome number

public class Assignment103_Palindrom {
	
	static int getPalindromNum(int num) {
		
		int reverseNum=0;
		
		while(num!=0) {
			int digit = num%10;
			reverseNum= reverseNum*10+digit;
			num=num/10;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		int num=1221;
		int ans=getPalindromNum(num);
		if(num==ans) {
			System.out.println(num+" is palindrome Number");
		}
		else {
			System.out.println(num+ " is not palindrome Number");
		}
		
		int num1=1211;
		int ans1=getPalindromNum(num1);
		if(num1==ans1) {
			System.out.println(num1+" is palindrome Number");
		}
		else {
			System.out.println(num1+ " is not palindrome Number");
		}
	}
}
