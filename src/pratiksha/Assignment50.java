package pratiksha;

public class Assignment50 {
	/*
	 Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47
	 */
	int getMinNum(int[]array) {
		int minNum= array[0];
		for(int i=0;i<array.length;i++) {
			if(minNum>array[i]) {
				minNum=array[i];
			}
		}
		return minNum;
	}
	String printNum(int[]array) {
		
		System.out.println("Input array: ");
		
		for(int i=0; i<array.length;i++) {
			
			System.out.println(array[i]+",");
		}
		System.out.println();
		
		return("Output minval: "+getMinNum(array));
	}
	public static void main(String[] args) {
		int[] input={44,45,22,25,47,29,46};
		
		int[] input1={-44,-45,-22,-25,-47,-29,-46};
		
		Assignment50 assign50= new Assignment50();
		
		System.out.println(assign50.printNum(input));
		
		System.out.println();
		
		System.out.println(assign50.printNum(input1));

	}
}
