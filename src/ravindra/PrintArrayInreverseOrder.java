package ravindra;

public class PrintArrayInreverseOrder {
	void reverseArray(int [] numbers) {
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		int []input={10,34,22,16,19,99};
		PrintArrayInreverseOrder printArrayInreverseOrder=new PrintArrayInreverseOrder();
		printArrayInreverseOrder.reverseArray(input);
	}
}
