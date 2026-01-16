package kishor;
//🔹 Assignment 103: Check for Palindrome
//📥 Input: naman, 1221
//✅ naman is a palindrome string
//✅ 1221 is a palindrome number
//❌ techno is not a palindrome string
//❌ 1211 is not a palindrome number

public class Assignment103_PalindromeString {
	
	static String getPalindromeString(String str) {
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch =str.charAt(i);
			s=s+ch;
		}
		return s;
	}
	
	public static void main(String[] args) {
		String name = "naman";
		String ans=getPalindromeString(name);
		if(name.equals(ans)) {
			System.out.println(name+ " String is palindrome");
		}
		else {
			System.out.println(name+ " String is not palindrome");
		}
		
		String name1 = "techno";
		String ans1=getPalindromeString(name1);
		if(name1.equals(ans1)) {
			System.out.println(name1+ " String is palindrome");
		}
		else {
			System.out.println(name1+ " String is not palindrome");
		}
	}
}
