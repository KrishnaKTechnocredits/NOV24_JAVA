package nilam.Array;
//return the maximum number from given array.
public class Assignmnet50 {
	
	int printMaxNum(int[] arr) {
		int maxNum=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxNum<arr[index]) {
				maxNum=arr[index];				
			}
		}
		return maxNum;
		
	}

	public static void main(String[] args) {
		Assignment49 assignment49=new Assignment49();
		int[] arr1= {44,-45,-22,-25,47,-29,0};
		int maxNum=assignment49.printMaxNum(arr1);
		System.out.println("Max number in given array: "+maxNum);
	
	}
}
