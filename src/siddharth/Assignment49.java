package siddharth;

/*Assignment - 49 : 16th Dec'2024 [15 mins] [imp]
return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
 */

public class Assignment49 {

	int getMaxNum(int[] arr) {
		int maxNum=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxNum<arr[index]) {
				maxNum=arr[index];
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		int[] input1={44,45,22,25,47,29,46};
		int answer = assignment49.getMaxNum(input1);
		System.out.println("Output1 : "+answer);
		int[] input2={-44,-45,-22,-25,-47,-29,-46};
		int answer2 = assignment49.getMaxNum(input2);
		System.out.println("Output2 : "+answer2);
	}
}
