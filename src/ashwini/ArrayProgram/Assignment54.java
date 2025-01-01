package ashwini.ArrayProgram;

/*Assignment - 54 : 16th Dec'2024 [5-7 mins]

Return the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10 */
public class Assignment54 {
	int[] getRevArray(int[] arr) {
		int[] output = new int[arr.length];
		for (int index = (arr.length) - 1, j = 0; index >= 0; index--, j++) {
			output[j] = arr[index];
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment54 a54 = new Assignment54();
		int[] arr = { 10, 34, 22, 16, 19, 99 };
		int[] ans = a54.getRevArray(arr);
		System.out.println("Reverse Array-->");
		for(int index=0;index<=(arr.length)-1;index++){
			System.out.println(ans[index]);
		}
		
	}

}
