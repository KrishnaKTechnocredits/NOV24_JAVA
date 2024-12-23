package pratiksha;

public class Assignment48 {
	/*
	 Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 
	 */
	int getCount(int[]array) {
		
		int count=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>0) {
				count++;
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int[] input= {10,30,-45,66,-10};
		
		Assignment48 assign48 = new Assignment48();
		
		assign48.getCount(input);
		
		System.out.println("Count of positive number is " + assign48.getCount(input));
	}
	

}
