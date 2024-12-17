package Assignment_Array;

public class Assignment53 {
	
	void printArrayInReverseOrder(int[] num) {
		for(int i = num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int[] num = {10,34,22,16,19,99};
		new Assignment53().printArrayInReverseOrder(num);
	}
}
