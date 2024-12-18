/*
 * Assignment - 54 : 16th Dec'2024 [5-7 mins]

return array in reverse order 

int[] getArrayInRev (int[] num)

 */

package mayur;

public class Assignment54 {
	
	int[] getArrayInRev(int[] num) {
		int[] revNum= new int[num.length];
		for (int i=num.length-1;i>=0;i--) {
			revNum[i]=num[i];
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		int[] num = {10,34,22,16,19,99};
		Assignment54 obj = new Assignment54();
		int[]revNum = obj.getArrayInRev(num);
		for (int i=revNum.length-1;i>=0;i--) {
			System.out.println(revNum[i]);
		}
	}
}
