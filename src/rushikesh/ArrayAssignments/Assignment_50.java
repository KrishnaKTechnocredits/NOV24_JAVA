package rushikesh.ArrayAssignments;

public class Assignment_50 {
	
	int getMinNum(int[] arr) {
		int minNum=arr[0];
		for (int index=1;index<arr.length;index++) {
			if (minNum>arr[index]) {
				minNum=arr[index];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_50 assignment_50=new Assignment_50();
		int[] arr1= {44,45,22,25,47,29,46};
		System.out.println(assignment_50.getMinNum(arr1));
		int[] arr2= {-44,-45,-22,-25,-47,29,46};
		System.out.println(assignment_50.getMinNum(arr2));
	}

}
