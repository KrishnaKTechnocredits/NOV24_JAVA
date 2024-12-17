/*
 * Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10
 */

package mayur.array;

public class Assignment53 {
	public static void main(String[] args) {
		int[] num = {10,34,22,16,19,99};
		for (int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}
}
