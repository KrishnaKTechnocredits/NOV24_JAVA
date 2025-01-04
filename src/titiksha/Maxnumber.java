//return second maximum number from given array.
//input = {33,33,19,55,53,11};
//output : 53 

package titiksha;

public class Maxnumber {

	int getmaxNumber(int[] arr) {
		int maxnum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxnum < arr[i]) {
				maxnum = arr[i];
			}
		}
		return maxnum;

	}
	
	int getSecondHightest(int[] arr) {
		int secondnum = 0;
		int maxnum = arr[0];
		if (arr[1] > maxnum) {
			secondnum = maxnum;
			maxnum = arr[1];
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > maxnum) {
				secondnum = maxnum;
				maxnum = arr[i];
			} else if (secondnum < arr[i]) {
				secondnum = arr[i];
			}
		}
		return secondnum;
	}

	public static void main(String[] args) {
		Maxnumber maxnumber = new Maxnumber();
		int[] arr = { 33, 33, 19, 55, 53, 11 };
		System.out.println("The highestnum is : "+maxnumber.getmaxNumber(arr));
		System.out.println("The second highestnum is :" +maxnumber.getSecondHightest(arr));

	}

}
