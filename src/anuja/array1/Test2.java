package anuja.array1;
//return the sum from a given array if those num divisible by 5 or 7
public class Test2 {
	
	public int getSumOfDigit(int[] arr) {
		int sum = 0 ;
		for(int i  = 0 ; i<arr.length	; i++) {
	
			if(arr [i] % 5 == 0 || arr [i] % 7 == 0) {
				sum = sum + arr [i];
				
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		Test2 a = new Test2 ();
		int [] arr = {44,45,22,25,21,29};
		a.getSumOfDigit(arr);
	}
}
