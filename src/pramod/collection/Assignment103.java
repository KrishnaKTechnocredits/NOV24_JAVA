/*
  Assignment 103: Check for Palindrome
📥 Input: naman, 1221
✅ naman is a palindrome string
✅ 1221 is a palindrome number
❌ techno is not a palindrome string
❌ 1211 is not a palindrome number

💡 Hint: A palindrome remains the same when reversed.
 */

package pramod.collection;

public class Assignment103 {
	
	void findStringIsPalindrom(String input){
		String revString ="";
		for(int i=input.length()-1;i>=0;i--) {
			char ch = input.charAt(i);
			revString = revString+ch;
		}
		if(input.equals(revString)) {
			System.out.println(input +" is Palindrome string");
		}else {
			System.out.println(input +" is not Palindrome string");
		}
	}

	public static void main(String[] args) {
		String input1="naman";
		String input2="1221";
		String input3="techno";
		String input4="1211";
		
		new Assignment103().findStringIsPalindrom(input1);
		new Assignment103().findStringIsPalindrom(input2);
		new Assignment103().findStringIsPalindrom(input3);
		new Assignment103().findStringIsPalindrom(input4);

	}

}
