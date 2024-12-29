package deepali.arrayProgram;

/*return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22

input : {-44,-45,-22,-25,-47,29,46}
output : -47
*/
public class Assignment_49 {

	void getMaxNum(int[] arr) {
		int maxNum=arr[0];
		int minNum=arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum=arr[index];
			}
			if (minNum > arr[index]) {
				minNum=arr[index];
			}
		}
		System.out.println(maxNum);
		System.out.println(minNum);
		System.out.println("1st");
	}
	
	public static void main(String[] args) {
		int[] arr = {44,45,22,25,47,29,46};
		Assignment_49 assignment = new Assignment_49();
		assignment.getMaxNum(arr);
		//System.out.println("Max number from given array: "+ maxNum);
		
		int[] arr1 = {-44,-45,-22,-25,-47,29,46};
//		Assignment_49 assignment_1 = new Assignment_49();
//		int minNum = assignment_1.getMaxNum(arr1);
//		System.out.println("Minium number from given array: "+ minNum);
		
	}
}
