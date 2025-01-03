package ashwini.ArrayProgram;

public class TestChallenge1 {

	int[] replaceArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int[] output = new int[arr.length];
		for (int index = 0; index <= (arr.length) - 1; index++) {
			output[index] = sum - arr[index];
		}
		return output;
	}

	public static void main(String[] args) {
		TestChallenge1 tc1 = new TestChallenge1();
		int[] input = { 3, 5, 7, 1, 9 };
		int[] ans = tc1.replaceArray(input);
		System.out.println("input:{3,5,7,1,9}");
		System.out.print("output: {");
		for (int i = 0; i <= (ans.length) - 1; i++) {
			System.out.print(+ans[i] + " ");
		}
		System.out.print("}");

	}

}
