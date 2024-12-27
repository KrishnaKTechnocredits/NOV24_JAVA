//From given int array, return count of positive numbers.
//input : {10,30,-45,66,-10};
//output : 3

package titiksha.Array;

public class Positivenumber {
	int count;
 void getCountOfPositiveNumber() {
		int[] num = { 10, 30, -45, 66, -10 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Positivenumber positivenumber = new Positivenumber();
		positivenumber.getCountOfPositiveNumber();
	}
}
