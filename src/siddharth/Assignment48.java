package siddharth;

/*Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.
input : {10,30,-45,66,-10};
output : 3  */

public class Assignment48 {

	int printPositive(int[] array) {
		int count=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]>0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment48 assignment48 = new Assignment48();
		int[] numbers = {10,30,-45,66,-10};
		int answer = assignment48.printPositive(numbers);
		System.out.println("output : "+answer);
	}
}