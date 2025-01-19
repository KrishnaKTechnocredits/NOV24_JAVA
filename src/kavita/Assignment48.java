package kavita;
/*Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 
Time:13m*/
public class Assignment48 {
	int getCountOfNumber(int[] input) {
		int count=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>0) {
				count++;
			}
		}
		System.out.println("Count of positive numbers in the array is "+count);
		return count;
	}
	
	public static void main(String[] args) {
		Assignment48 assignment48=new Assignment48();
		int[] input={10,30,-45,66,-10};
		assignment48.getCountOfNumber(input);
	}

}
