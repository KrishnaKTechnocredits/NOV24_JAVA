package pratiksha;

public class Assignment49 {
	/*
	 Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
	 */
	
	int getMaxNum(int[]array) {
		
		int maxNum=array[0];
		
		for(int i=0;i<array.length;i++) {
			
			if(maxNum<array[i]) {
				
				maxNum=array[i];
			}
		}
		return maxNum;
	}
	String printNum(int[]array) {
		
		System.out.println("Input array: ");
		
		for(int i=0; i<array.length;i++) {
			
			System.out.println(array[i]+",");
		}
		System.out.println();
		
		return("Output maxnum: "+getMaxNum(array));
	}
	public static void main(String[] args) {
		int[] input={44,45,22,25,47,29,46};
		int[] input1={-44,-45,-22,-25,-47,-29,-46};
		Assignment49 assign49= new Assignment49();
		System.out.println(assign49.printNum(input));
		System.out.println();
		System.out.println(assign49.printNum(input1));
	}
}
