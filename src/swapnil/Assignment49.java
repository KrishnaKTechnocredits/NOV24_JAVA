package swapnil;

public class Assignment49 {
	
	int maxNum(int[] input) {
		int maxNum=input[0];
		for(int i=0;i<input.length-1;i++) {
			if(maxNum<input[i]) {
				maxNum=input[i];
			}
		}
		return maxNum;
	}
	

	public static void main(String[] args) {
		int[] arr= {44,45,22,25,47,29,46};
		int[] arr1={-44,-45,-22,-25,-47,-29,-46};
		Assignment49 a = new Assignment49();
		a.maxNum(arr);
		a.maxNum(arr1);
		int output = a.maxNum(arr);
		int output1 = a.maxNum(arr1);
		System.out.println(output);
		System.out.println(output1);	
	}

}
