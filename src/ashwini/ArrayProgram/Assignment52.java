package ashwini.ArrayProgram;
/*Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){
	
} */

public class Assignment52 {
	int getMaxNum(int[]arr) {
		int maxNum=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxNum<arr[index]) {
				maxNum=arr[index];
			}
		}
		return maxNum;
	}
	int getMinNum(int[]arr) {
		int minNum=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(minNum>arr[index]) {
				minNum=arr[index];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		Assignment52 a52=new Assignment52();
		int[] arr={44,45,22,100,47,90,46,12};
		int ans1=a52.getMaxNum(arr);
		int ans2=a52.getMinNum(arr);
		System.out.println("Maximum number is-->"+ans1);
		System.out.println("Minimum number is-->"+ans2);
	}

}
