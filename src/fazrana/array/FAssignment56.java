//Assignment - 56 : 20th Dec'2024 [15 mins]
//Return the array having maximum number from each index of given two array.
//
//input : 
//{10,55,22,77,88}
//{5,102,28,77,18}
//
//output : [10,102,28,77,88]
//
//NOTE : Use sop(Arrays.toString(output)) to print the array without for loop

package fazrana.array;

public class FAssignment56 {
	int[] getMaxArray(int[] array1, int[] array2) {
		int[] maxArray= new int[array1.length];
		for(int i=0;i< array1.length;i++) {
			if (array1[i]>=array2[i]) {
				maxArray[i]=array1[i];
			}else {
				maxArray[i]=array2[i];
			}
		}
		return maxArray;
	}
	
	void printMaxArray(int[] array1, int[] array2) {
		System.out.println("Input Array:");
		System.out.print("{");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+",");
		}System.out.println("}");
		
		System.out.print("{");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array2[i]+",");
		}System.out.println("}");
		
		int[] maxArray= getMaxArray(array1, array2);
		System.out.print("Output Array: {");
		for (int j=0;j<maxArray.length;j++) {
			System.out.print(maxArray[j]+",");
		}System.out.println("}");
	}
	
	public static void main(String[] args) {
		int[] input1= {10,55,22,77,88};
		int[] input2={5,102,28,77,18};
		FAssignment56 fassignment56=new FAssignment56();
		fassignment56.printMaxArray(input1, input2);
	}
}
