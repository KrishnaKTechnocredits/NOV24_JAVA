/*Find palindrome of below input :
Input : naman ,1221*/

package sindhu.assignment102to107;

public class Assignment103 {
	public static void main(String[] args) {
		String word = "naman";
		int num = 1221;
		Assignment103 a103 = new Assignment103();
		a103.checkIfPalindrome(word);
		a103.checkIfNumIsPalindrome(num);
	}
	
	public void checkIfPalindrome(String word) {
		String revWord ="";
		for(int i=word.length()-1; i>=0; i--) {
			char ch = word.charAt(i);
			revWord = revWord+ch;
		}
		System.out.println("the reverse word is: "+revWord);
		
		if(word.equals(revWord)) {
			System.out.println("The word "+word+" is palindrome.");
		}else {
			System.out.println("The word "+word+" is not palindrome.");
		}
		System.out.println();
	}
	
	public void checkIfNumIsPalindrome(int num) {
		int originalNum = num;
		int revNum=0;
		while(num!=0) {
			int digit = num%10;
			revNum = revNum*10+digit;
			num=num/10;
		}
		System.out.println("The reverse of num is: "+revNum);
		
		if(originalNum==revNum) {
			System.out.println("The num "+originalNum+" is palindrome.");
		}else {
			System.out.println("The num "+originalNum+" is not palindrome.");
		}
	}
}
