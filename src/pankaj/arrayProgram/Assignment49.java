package pankaj.arrayProgram;

public class Assignment49 {

	int maxNum(int[] arr) {

		int maxvalue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxvalue < arr[i]) {
				maxvalue = arr[i];
			}
		}
		System.out.println("The maximum number is==>> "+ maxvalue);
		return maxvalue;
		
	}

	public static void main(String[] args) {

		int[] temp = { 44, 45, 22, 25, 47, 29, 46 };
		int[] temp1 = { -44, -45, -22, -25, -47, -29, -46 };
		Assignment49 A = new Assignment49();
		A.maxNum(temp);
		A.maxNum(temp1);
		
	}
}
