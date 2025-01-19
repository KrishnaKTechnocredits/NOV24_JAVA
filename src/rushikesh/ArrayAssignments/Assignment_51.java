package rushikesh.ArrayAssignments;

public class Assignment_51 {
	
	void printMaxMinNumber(int[] arr) {
		int maxNum=arr[0];
		int minNum=arr[0];
		for (int index=0;index<arr.length;index++) {
			if (maxNum<arr[index]) {
				maxNum=arr[index];
			}
			if (minNum>arr[index]) {
				minNum=arr[index];
			}
		}
		System.out.println("int[] arr={44,45,22,25,47,29,46}");
		System.out.println("Max Number in array "+maxNum);
		System.out.println("Min Number in array "+minNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_51 assignment_51=new Assignment_51();
		int[] arr= {44,45,22,25,47,29,46};
		assignment_51.printMaxMinNumber(arr);
	}

}
