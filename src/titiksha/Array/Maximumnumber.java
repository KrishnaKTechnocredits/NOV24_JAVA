//return the maximum number from given array. 
//input : {44,45,22,25,47,29,46}
//output : 47

package titiksha.Array;

public class Maximumnumber {
	int maxNumber(int[] num) {
		int maxnumber = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > maxnumber) {
				maxnumber = num[i];
			}
		}
		return maxnumber;
	}

	public static void main(String[] args) {
		Maximumnumber maximumnumber = new Maximumnumber();
		int[] num = { 44, 45, 22, 25, 47, 29, 46 };
		int num1[]= {-44,-45,-22,-25,-47,-29,-46};
		int maxNum = maximumnumber.maxNumber(num);
		int maxNum1 = maximumnumber.maxNumber(num1);
		System.out.println(maxNum);
		System.out.println(maxNum1);
	}

}
