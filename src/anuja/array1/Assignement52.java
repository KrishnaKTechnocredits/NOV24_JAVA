package anuja.array1;
/*--return array , pass aray 

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){
	
} */
public class Assignement52 {

	public int[] getMaxMinNum(int[] arr) {
		int[] output = new int[2];
		int minNum = arr [0];
		int maxNum = arr [0];
		for(int i = 0 ; i<arr.length ; i++) {
			if(minNum > arr [i]) {
				minNum  = arr[i];
			}
			if(maxNum < arr [i]) {
				maxNum  = arr[i];
			}
		}
		
		output [0] = maxNum ;
		output [1] = minNum;
		System.out.println("Max num from a given array stored in new array output is: " +output[0] +"\n");
		System.out.println("Min num from a given array stored in new array output is: " +output[1] +"\n");

		return output;
		
	}
	
	public static void main(String[] args) {
		Assignement52 assignement52 = new Assignement52() ;
		int[] num = {44,45,22,-25,47,29,46};
		assignement52.getMaxMinNum(num);
		
	}
}
