//Assignment - 48 : 15th Dec'2024 [15 mins]
//
//From given int array, return count of positive numbers.
//
//input : {10,30,-45,66,-10};
//output : 3 
//5min
package fazrana.array;

public class FAssignment48 {
	int getCount(int[] array) {
		int count=0; 
		for(int i=0; i< array.length;i++) {
			if(array[i]>0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input={10,30,-45,66,-10};
		FAssignment48 fassignment48=new FAssignment48();
		System.out.println("Count of positive number is "+fassignment48.getCount(input) );
	}
}
