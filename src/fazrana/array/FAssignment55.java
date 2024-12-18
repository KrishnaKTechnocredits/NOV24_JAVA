//Assignment - 55 : 18th Dec'2024 [15-20 mins]
//
//return union of given two array.
//
//input : 
//{10,19,18}
//{99,8}

//output :  {10,19,18,99,8}

package fazrana.array;

public class FAssignment55 {
	int[] unionArray(int[] array1, int[] array2) {
		int index = 0;
		int[] union = new int[array1.length + array2.length];
		System.out.print("Input: {");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + ",");
			union[index] = array1[i];
			index++;
		}
		System.out.print("}{");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ",");
			union[index] = array2[i];
			index++;
		}
		System.out.println("}");
		return union;
	}

	void printArray(int[] array1, int[] array2) {
		int[] union = unionArray(array1, array2);
		System.out.print("Output: {");
		for (int i = 0; i < union.length; i++) {
			System.out.print(union[i] + ",");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		int[] input1 = { 10, 19, 18 };
		int[] input2 = { 99, 8 };
		FAssignment55 fassignment55 = new FAssignment55();
		fassignment55.printArray(input1, input2);
	}
}
