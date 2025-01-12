/*
 * Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array. 

void findMaxMin(int[] arr){
	int maxNum=arr[0], minNum=arr[0];
} 

 */

package mayur.array;

public class Assignment51 {
	
	void findMaxMinNum(int[] num) {	
		int max =num[0];
		for (int i=0;i<num.length-1;i++) {
			if (num[i] > num[i+1] && num[i] >= max) {
				max=num[i];
			}else if(num[i+1] > num[i] && num[i+1] >= max){
				max=num[i+1];
			}
		}
		int min =num[0];
		for (int i=0;i<num.length-1;i++) {
			if (num[i] < num[i+1] && num[i] <= min) {
				min=num[i];
			}else if(num[i+1] < num[i] && num[i+1] <= min){
				min=num[i+1];
			}
		}
		System.out.println("Maximum number in given array is = "+max);
		System.out.println("Minimum number in given array is = "+min);
		
	}
	
	public static void main(String[] args) {
		Assignment51 obj = new Assignment51();
		int[] num1 ={44,45,22,25,47,29,46};
		int[] num2 = {-44,-45,-22,-25,-47,-29,-46};
		obj.findMaxMinNum(num1);
		obj.findMaxMinNum(num2);
	}
}

