/*
 * Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}

 */

package mayur;

public class Assignment55 {
	
	int[] getUnionOfTwoArray(int[] num1, int[] num2) {
		int[] num = new int[(num1.length+num2.length)];
		for (int i = 0 ; i < (num1.length+num2.length); i++) {			
			if(i<num1.length) {
				num[i]=num1[i];
			}else if (i>=num1.length) {
				num[i]=num2[i-num1.length];
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] num1 = {10,19,18};
		int[] num2 = {99,8};
		
		Assignment55 obj = new Assignment55();		
		int [] num = obj.getUnionOfTwoArray(num1, num2);
		
		for (int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}
