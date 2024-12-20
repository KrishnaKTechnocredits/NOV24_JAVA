package swapnil;

public class Assignment53 {
	
	void revArray(int[] input) {
		int[] A = new int[input.length];
		for(int i=input.length-1,j=0;i>=0;i--,j++) {
			A[j]=input[i];
			System.out.print(A[j]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,34,22,16,19,99};
		//99 19 16
		//99 1916
		Assignment53 a = new Assignment53();
		a.revArray(arr);
	}

}
