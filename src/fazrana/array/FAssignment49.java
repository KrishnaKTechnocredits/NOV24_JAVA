//Assignment - 49 : 16th Dec'2024 [15 mins] [imp]
//
//return the maximum number from given array. 
//
//input : {44,45,22,25,47,29,46}
//output : 47
//
//input : {-44,-45,-22,-25,-47,-29,-46}
//output : -22
//10min
package fazrana.array;

public class FAssignment49 {
	int getMaxNum(int[] array) {
		int maxNum=array[0];
		for(int i=1;i< array.length;i++) {
			if(maxNum<array[i]) {
				maxNum=array[i];
			}
		}
		return maxNum;
	}
	
	String printNum(int[] array) {
		System.out.print("Input array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
		return ("Output maxnum: "+ getMaxNum(array));
	}
	
	
	public static void main(String[] args) {
		int[] input= {44,45,22,25,47,29,46};
		int[] input1= {-44,-45,-22,-25,-47,-29,-46};
		FAssignment49 fassignment49=new FAssignment49();
		System.out.println(fassignment49.printNum(input));
		System.out.println();
		System.out.println(fassignment49.printNum(input1));
	}
}
