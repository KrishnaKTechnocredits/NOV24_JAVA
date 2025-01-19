package rushikesh.ArrayAssignments;

public class Assignment_60 {

	void printSecondHighestNum(int[] arr) {
		int maxNum = arr[1];
		int secondMaxNum = arr[0];
		if (arr[0]>arr[1]) {
			maxNum=arr[0];
			secondMaxNum=arr[1];
		}
		for (int i = 2; i < arr.length; i++) {
			if (maxNum<arr[i]) {
				secondMaxNum=maxNum;
				maxNum=arr[i];
			}else if(secondMaxNum<arr[i]) {
				secondMaxNum=arr[i];
			}
		}
		System.out.println(secondMaxNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_60 assignment_60 = new Assignment_60();
		int[] arr = { 94, 55, 50, 75, 74 };
		assignment_60.printSecondHighestNum(arr);
	}
}
