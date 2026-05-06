//🔹 Assignment 103: Check for Palindrome
//📥 Input: naman, 1221
//✅ naman is a palindrome string
//✅ 1221 is a palindrome number
//❌ techno is not a palindrome string
//❌ 1211 is not a palindrome number

package fazrana.numbers;

public class FAssignment103 {
	int getReverseInteger(int num) {
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
	}
	
	String getReverseString(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			str1=str1+str.charAt((str.length()-1)-i);
		}
		return str1;
	}
	
	void checkPalindrome(int input) {
		int origial=input;
		int finalValue=getReverseInteger(input);
		if(origial==finalValue) {
			System.out.println(origial+" is Palindrome");
		}else {
			System.out.println(origial+" is not Palindrome");
		}
	}
	
	void checkPalindrome(String input) {
		input=input.toLowerCase();
		String origial=input;
		String finalValue=getReverseString(input);
		if(origial.equals(finalValue)) {
			System.out.println(origial+" is Palindrome");
		}else {
			System.out.println(origial+" is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		FAssignment103 fassignment103=new FAssignment103();
		fassignment103.checkPalindrome(1331);
		fassignment103.checkPalindrome(1231);
		fassignment103.checkPalindrome("Naman");
		fassignment103.checkPalindrome("techno");
	}
}
