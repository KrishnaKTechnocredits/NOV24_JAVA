//Assignment 102: Reverse a Number Without Using Strings
//📥 Input: 321
//📤 Output: 123

package fazrana.numbers;

public class FAssignment102 {
	int rev=0;
	int reverseNumber(int num) {
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		FAssignment102 fassignment102=new FAssignment102();
		System.out.println(fassignment102.reverseNumber(321));
	}
}
