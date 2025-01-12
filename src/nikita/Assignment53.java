/* Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10*/

package nikita;

public class Assignment53 {
	
	void displayRevArray(int[] arr) {
		for (int i = arr.length-1; i>=0; i--) 
		{
			System.out.println(arr[i]);
		}
 	}

	public static void main(String[] args) {
		int[] arr = {10,34,22,16,19,99};
		Assignment53 a53 = new Assignment53();
		a53.displayRevArray(arr);
	}
}
