/*
 * Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
 */

package mayur.array;

public class Assignment49 {
	int getMaxNum(int[] num) {	
		int temp =num[0];
		for (int i=0;i<num.length-1;i++) {
			if (num[i] > num[i+1] && num[i] >= temp) {
				temp=num[i];
			}else if(num[i+1] > num[i] && num[i+1] >= temp){
				temp=num[i+1];
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Assignment49 obj = new Assignment49();
		int[] num1 ={44,45,22,25,47,29,46};
		int[] num2 = {-44,-45,-22,-25,-47,-29,-46};
		System.out.println(obj.getMaxNum(num1));
		System.out.println(obj.getMaxNum(num2));
	}
}
