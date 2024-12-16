package kishor;

//return the Minimum number from given array. 
public class Assignment50_Array {

	int getMinNumber(int[] input) {
		int MinNumber = input[0];
		// if i start from zero as well then no impact-just 0 index comapir again with 0
		// index
		for (int i = 0; i < input.length; i++) {
			if (input[i] < MinNumber) {
				MinNumber = input[i];
			}
		}
		return MinNumber;
	}

	public static void main(String[] args) {
		int[] values = { 44, 45, 22, 25, 47, 29, 46 };
		int[] values1 = { -44, -45, -22, -25, -47, 29, 46 };

		Assignment50_Array assignment50 = new Assignment50_Array();
		int ans = assignment50.getMinNumber(values);
		System.out.println("Minimum number in given string is:- " + ans);

		int ans1 = assignment50.getMinNumber(values1);
		System.out.println("Minimum number in given string is:- " + ans1);

	}
}
