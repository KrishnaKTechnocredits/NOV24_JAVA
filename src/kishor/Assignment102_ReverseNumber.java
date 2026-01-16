package kishor;
//🔹 Assignment 102: Reverse a Number Without Using Strings
//📥 Input: 321
//📤 Output: 123

public class Assignment102_ReverseNumber {
	
	static int getReverseNum(int num) {
		
		int reverseNum=0;
		
		while(num!=0) {
			int digit = num%10;
			reverseNum = reverseNum*10+digit;
			num= num/10;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		
		int num=1234;
		int ans=getReverseNum(num);
		System.out.println(num+"->"+ans);
	}
}
