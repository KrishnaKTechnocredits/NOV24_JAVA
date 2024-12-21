package reshma;
/* print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10 */

public class Assignment53_PrintRevArray {
	/*public static void main(String[] args) {
	int []input = {10,34,22,16,19,99};

	for(int i=input.length-1;i>=0;i--) {
		System.out.println(input[i]);
	}
	
}*/

	void PrintRev(int [] input) {
	for(int i=input.length-1;i>=0;i--) {
		System.out.println( input[i]);			
		}
	}
	public static void main(String[] args) {
	Assignment53_PrintRevArray a53=new Assignment53_PrintRevArray();	
	int []input = {10,34,22,16,19,99};
	System.out.println( "The array in reverse order is ");
	a53.PrintRev(input);			
	}
}
