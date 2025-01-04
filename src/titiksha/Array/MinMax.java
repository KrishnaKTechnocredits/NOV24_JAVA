//print maximum and minimum number from given array. 
//input : {44,45,22,25,47,29,46}
//output : 47,22


package titiksha.Array;

public class MinMax {
	void getminMax(int[] arr) {
		int maxNum = arr[0];
		int minNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minNum >arr[i]) {
				minNum = arr[i];
			}
		
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("The minimum from given array is:"+minNum);
		System.out.println("The maximum from given array is:"+ maxNum);
	}
	

	public static void main(String[] args) {
		MinMax minMax = new MinMax();
		int[] number = { 44, 45, 22, 25, 47, 29, 46 };
		minMax.getminMax(number);

	}

}
