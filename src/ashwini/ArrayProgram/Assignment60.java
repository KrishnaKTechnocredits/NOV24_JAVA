package ashwini.ArrayProgram;
/*
 Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
 */
public class Assignment60 {
	int secondMaxNum(int[] arr) {
		int maxNum=arr[0];
		int secondMaxNum= arr[1];
		if(arr[0]<arr[1]) {
			maxNum=arr[1];
			secondMaxNum=arr[0];
		}
		for(int i=0;i<arr.length;i++) {
			if(maxNum<arr[i]) {
				secondMaxNum=maxNum;
				maxNum=arr[i];
			}else if(secondMaxNum<arr[i]) {
				secondMaxNum=arr[i];
			}
		}
		return secondMaxNum;
		
	}

	public static void main(String[] args) {
		int[] arr={33,33,19,55,53,11};
		Assignment60 a60=new Assignment60();
		System.out.println("Input:{33,33,19,55,53,11};");
		int secondMaxNum = a60.secondMaxNum(arr);
		System.out.println(secondMaxNum);
	}

}
