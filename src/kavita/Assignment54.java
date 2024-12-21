package kavita;

import java.util.Arrays;

/*return the array having elements in reverse order of original array*/
/*Time:11m*/
public class Assignment54 {
	int[] getReturnReversOrderArray(int[] arr) {
		int[] reverseInput=new int[arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--,j++) {
			reverseInput[j]=arr[i];
		}
		return reverseInput;
	}
	
	public static void main(String[] args) {
		Assignment54 assign54 = new Assignment54();
		int[] input = { 10, 34, 22, 16, 19, 99 };
		int[] ans = assign54.getReturnReversOrderArray(input);
		System.out.println(Arrays.toString(ans));
	}
}
