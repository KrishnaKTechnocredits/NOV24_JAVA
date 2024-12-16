package anuja.array1;

//find the diff of even and odd number
public class Test3 {
	int evenSum ;
	int oddSum;
	int diff;
	
	public int printDiffOfEvenOddSum(int [] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1 [i] +" " );
			if(arr1[i]%2==0) {
				evenSum = evenSum + arr1[i];
			}
			else {
				oddSum = oddSum + arr1[i];
			}
		}
		diff = evenSum - oddSum ;
		System.out.println();
		if(diff>0)
			System.out.println("Even num sum and odd num sum diff is " +diff);
			
		else 
			System.out.println("Even num sum and odd num sum diff is " +(oddSum - evenSum));
		return diff;	
		}	

	public static void main(String[] args) {
	Test3 a = new Test3();
		int[] arr1 = {44,45,22,25,21,29};
		a.printDiffOfEvenOddSum(arr1);
	}

}
