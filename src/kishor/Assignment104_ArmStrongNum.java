package kishor;
//🔹 Assignment 104: Check for Armstrong Number
//📥 Input: 153
//✅ 153 is an Armstrong number
//📥 Input: 123
//❌ 123 is not an Armstrong number
//💡 Hint: An Armstrong number is one where the sum of each digit raised to 
//the power of the number of digits equals the original number.

public class Assignment104_ArmStrongNum {
	
	static int getArmStrongNum(int num) {
		
		int sum=0;
		while(num!=0) {
			int digit = num%10;
			sum = sum+ digit*digit*digit;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num=153;
		int ans=getArmStrongNum(num);
		if(num==ans) {
			System.out.println(num+ " is Armstrong number");
		}
		else {
			System.out.println(num+ " is not armstrong num");
		}
		
		int num1=123;
		int ans1=getArmStrongNum(num1);
		if(num1==ans1) {
			System.out.println(num1+ " is Armstrong number");
		}
		else {
			System.out.println(num1+ " is not armstrong num");
		}
	}
}
