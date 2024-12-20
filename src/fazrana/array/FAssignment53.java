//Assignment - 53 : 16th Dec'2024 [5-7 mins]
//
//print the array in reverse order. 
//
//input : {10,34,22,16,19,99}
//output : 99
//         19
//		 16
//		 22
//		 34
//		 10

package fazrana.array;

public class FAssignment53 {
	int[] getRevArray(int[] array) {
		int[] rev=new int[array.length];
		for(int i=(array.length-1);i>=0;i--) {
			rev[(array.length-1)-i]=array[i];
		}
		return rev;
	}
	
	void printRevArray(int[] array) {
		System.out.print("Input array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
		System.out.print("Reverse array: ");
		int[] rev=getRevArray(array);
		for(int i=0;i<rev.length;i++) {
			System.out.print(rev[i]+",");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] array= {-44,-45,-22,-25,-47,29,46};
		int[] array1= {44,45,22,25,47,29,46};
		FAssignment53 fassignment53=new FAssignment53();
		fassignment53.printRevArray(array);
		fassignment53.printRevArray(array1);
	}
}
