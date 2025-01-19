/*
 * Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 

 */

package mayur.array;

public class Assignment48 {
	
	int getPosNumCount(int[] num) {
		int count =0;
		for (int i=0;i<num.length;i++) {
			if (num[i]>0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment48 obj = new Assignment48();
		int[] num = {10,30,-45,66,-10};
		System.out.println(obj.getPosNumCount(num));
	}
}
