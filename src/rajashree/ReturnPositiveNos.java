package rajashree;
//48.From given int array, return count of positive numbers.

public class ReturnPositiveNos {
		
	int positiveNumber() {
		int count=0;
		int[] num = {10,30,-45,66,-10};
		for(int index=0; index<num.length; index++) {
			int num1 = num[index];
			if (num1>0) {
			count ++;
			}
		}
		return count;
	}
	
	public static void  main(String[] args) {
		ReturnPositiveNos ex1 = new ReturnPositiveNos();
		int count = ex1.positiveNumber();
		System.out.println(count);
		}

}
