package ashwini.ArrayProgram;

/*return union of given two array.
 input:{10,19,18}
 		{99,8}
 output:{10,19,18,99,8}
 */
public class Assignment55UnionOfArray {

	int[] unionArray(int[] num1, int[] num2) {
		int[] output = new int[num1.length + num2.length];
		int currentIndex = 0;
		System.out.print("Input: {");
		for (int index = 0; index <= (num1.length)-1; index++) {
			output[currentIndex] = num1[index];
			System.out.print(num1[index]+" ");
			currentIndex++;
		}
		System.out.print("}{");
		for (int index1 = 0; index1 <= (num2.length)-1; index1++) {
			output[currentIndex] = num2[index1];
			System.out.print(num2[index1]+" ");
			currentIndex++;
		}
		System.out.print("}");
		return output;
	}

	public static void main(String[] args) {
		Assignment55UnionOfArray a55 = new Assignment55UnionOfArray();
		int[] num1 = { 10, 12, 15 };
		int[] num2 = { 55, 12 };
		int[] unionArray = a55.unionArray(num1, num2);
		System.out.println();
		System.out.println("Union of given two Array is-->" );
		System.out.print("{" );
		for (int i = 0; i <= (unionArray.length)-1; i++) {
			System.out.print( +unionArray[i]+" ");
		}
		System.out.print("}" );
	}
}
