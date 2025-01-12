/*
 * Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){
	
} 
 */


package mayur.array;

public class Assignment52 {
	
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
	
	int getMinNum(int[] num) {	
		int temp =num[0];
		for (int i=0;i<num.length-1;i++) {
			if (num[i] < num[i+1] && num[i] <= temp) {
				temp=num[i];
			}else if(num[i+1] < num[i] && num[i+1] <= temp){
				temp=num[i+1];
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Assignment52 obj = new Assignment52();
		int[] num1 ={44,45,22,25,47,29,46};
		int[] num2 = {-44,-45,-22,-25,-47,29,46};
		System.out.println("Maximum number in given array is = "+obj.getMaxNum(num1));
		System.out.println("Minimum number in given array is = "+obj.getMinNum(num1));
		System.out.println("Maximum number in given array is = "+obj.getMaxNum(num2));		
		System.out.println("Minimum number in given array is = "+obj.getMinNum(num2));
	}
}
