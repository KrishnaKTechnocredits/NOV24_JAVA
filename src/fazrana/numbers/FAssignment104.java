//🔹 Assignment 104: Check for Armstrong Number
//📥 Input: 153
//✅ 153 is an Armstrong number
//
//📥 Input: 123
//❌ 123 is not an Armstrong number
//
//💡 Hint: An Armstrong number is one where the sum of each digit raised to the power of the number of digits equals the original number.

package fazrana.numbers;

public class FAssignment104 {
	void getAmstringNumber(int num) {
		int value=0;
		String num1=String.valueOf(num);
		for(int i=0; i<num1.length();i++) {
			int value1=Character.getNumericValue(num1.charAt(i));
			value=(int) (value+Math.pow(value1,num1.length()));
			System.out.println(value+" "+ i);
		}
		if(num==value) {
			System.out.println(num+" is an Armstrong Number");
		}else {
			System.out.println(num+" is not an Armstrong Number");
		}
	}
	
	void getAmstringNumber1(int num) {
		int origial= num;
		int value=0;
		int totalCount=String.valueOf(num).length();
		
		while(num!=0) {
			int digit=num%10;
			value=(int)(value+ Math.pow(digit, totalCount));
			num=num/10;
		}
		if(value==origial) {
			System.out.println(origial+" is an Armstrong Number");
		}else {
			System.out.println(origial+" is not an Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
		FAssignment104 fassignment104=new FAssignment104();
		fassignment104.getAmstringNumber1(153);
	}
}
