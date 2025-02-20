package ashwini.interview;
/*
  Assignment 104: Check for Armstrong Number
📥 Input: 153
✅ 153 is an Armstrong number

📥 Input: 123
❌ 123 is not an Armstrong number

💡 Hint: An Armstrong number is one where the sum of each digit raised to the power of the number of digits equals the original number.

 */
public class ArmstrongAssignment104 {
int getArmstronNum(int num) {
	int sum=0;
	while(num>0) {
		int digit=num%10;
		sum=  sum +(digit*digit*digit);
		num=num/10;
	}
	return sum;
}
public static void main(String[] args) {
	ArmstrongAssignment104 a1= new ArmstrongAssignment104();
	int num=153;
	System.out.println("Input: "+num);
	int armstrongNum=a1.getArmstronNum(num);
	if(num==armstrongNum) {
	System.out.println(armstrongNum+" is Armstrong number.");
}else {
	System.out.println(num+" is not Armstrong number.");
}
}
}
