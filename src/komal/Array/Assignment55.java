
//Assignment - 55 : 18th Dec'2024
//
//return union of given two array.
//
//input : 
//{10,19,18}
//{99,8}
//
//output :  {10,19,18,99,8}
package komal.Array;

public class Assignment55 {
	int[] unionArray;

	int[] getUnionArray() {
		int[] a1 = { 10, 19, 18 };
		int[] a2 = { 99, 8 };
		unionArray = new int[a1.length + a2.length];
		for (int i = 0; i < a1.length; i++) {
			unionArray[i] = a1[i];
		}
		int count = a1.length;
		for (int j = 0; j < a2.length; j++) {
			unionArray[count] = a2[j];
			count++;
		}
		return unionArray;
	}

	public static void main(String args[]) {

		Assignment55 a55 = new Assignment55();
		int[] outputArray = a55.getUnionArray();
		for (int k = 0; k < outputArray.length; k++) {
			System.out.println(a55.unionArray[k]);
		}
	}
}
