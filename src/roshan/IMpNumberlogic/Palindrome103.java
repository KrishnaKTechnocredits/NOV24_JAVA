package roshan.IMpNumberlogic;

public class Palindrome103 {
	  void getpalindromestring (String []input) {
		  for(int i =0 ;i<input.length;i++) {
			  String input1=input [i];
			  StringBuilder sb = new StringBuilder(input1);
			  sb.reverse();
			  if(input1.equals(sb.toString())){
				  System.out.println(input1 +" is Palindrome String" );
			  }
			  else {
				  System.out.println(input1 +" is not Palindrome String" );

			  }
			  
		  }	
	  }
	  
	
	  public static void main(String[] args) {
		String [] input = {"naman","1221","techno","1211"};
		Palindrome103 palindrome = new Palindrome103();
		palindrome.getpalindromestring(input);
		
	}
}



/*
 * Assignment 103: Check for Palindrome 📥 Input: naman, 1221 ✅ naman is a
 * palindrome string ✅ 1221 is a palindrome number ❌ techno is not a palindrome
 * string ❌ 1211 is not a palindrome number
 */