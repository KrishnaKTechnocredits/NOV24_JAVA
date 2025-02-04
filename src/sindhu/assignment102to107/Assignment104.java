/*Check for Armstrong Number
📥 Input: 153
✅ 153 is an Armstrong number*/

package sindhu.assignment102to107;

public class Assignment104 {
	public static void main(String[] args) {
		int num1 = 153;
		int num2 = 123;
		System.out.println("The input number is:"+num1);
		System.out.println("The input number is:"+num2);
		Assignment104 a104 = new Assignment104();
		a104.checkIfArmstrong(num1);
		a104.checkIfArmstrong(num2);
	}
	
	public void checkIfArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		
		while(num>0) {
			int digit = num%10;
			sum = sum+(digit*digit*digit);
			num=num/10;
		}
		
		if(sum==originalNum) {
			System.out.println("The number "+originalNum+" is Armstrong.");
		}else {
			System.out.println("The number "+originalNum+" is not Armstrong.");
		}
	}
}
