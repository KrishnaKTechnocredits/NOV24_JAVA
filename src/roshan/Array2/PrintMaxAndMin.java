package roshan.Array2;

public class PrintMaxAndMin {


	void getMaxMinNo(int[] number) {
		int minnum = number[0];
		int maxnum = number[0];
		for (int i = 0; i < number.length; i++) {
			if (minnum < number[i]) {
				minnum = number[i];
			}
			if (maxnum > number[i]) {
				minnum = number[i];

			}
		}
		System.out.println(" min num is >> " + minnum);
		System.out.println(" max num is >> " + maxnum);
	}

	public static void main(String[] args) {
		int[] number = { 10, 20, 30, 40, 50, 60, 70 };
		PrintMaxAndMin printmaxandmin = new PrintMaxAndMin();
		printmaxandmin.getMaxMinNo(number);

	}
}

/*
 * Assignment - 51 : 16th Dec'2024 [15 mins]
 * 
 * print maximum and minimum number from given array.
 * 
 * void findMaxMin(int[] arr){ int maxNum=arr[0], minNum=arr[0]; }
 */