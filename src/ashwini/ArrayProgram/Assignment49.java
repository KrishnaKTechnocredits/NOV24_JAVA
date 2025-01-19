package ashwini.ArrayProgram;
/*Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
*/

public class Assignment49 {
	
	void getMaxNmmber(int[] arr) {
		int maxNum=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxNum < arr[index])
				maxNum=arr[index];
		}
		System.out.println("Max Num in given stringis "+ maxNum);
	}

	public static void main(String[] args) {
		Assignment49 assn49=new Assignment49();
		int[] arr1={44,45,22,25,47,29,46};
		int[] arr2= {-44,-45,-22,-25,-47,-29,-46};
		assn49.getMaxNmmber(arr1);
		assn49.getMaxNmmber(arr2);
		
	
	}

}
