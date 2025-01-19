package ravindra;

public class ReturnMaxNumFromArray {
	int maxNum(int[] numbers) {
		int maxnum = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maxnum) {
				maxnum = numbers[i];
			}
		}
		return maxnum;
	}

	public static void main(String[] args) {
		int[] input1 = {44,45,22,25,47,29,46};
		int[] input2 ={-44,-45,-22,-25,-47,-29,-46};
		ReturnMaxNumFromArray returnMaxNumFromArray=new ReturnMaxNumFromArray();
		int maxnum1=returnMaxNumFromArray.maxNum(input1);
		System.out.println(maxnum1);
		int maxnum2=returnMaxNumFromArray.maxNum(input2);
		System.out.println(maxnum2);
	}
}
