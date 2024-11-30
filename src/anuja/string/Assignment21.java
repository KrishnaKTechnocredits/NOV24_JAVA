package anuja.string;
/*Find the length of the given string excluding space.
input : "prem lata gupta"
output : length without space is 13 and space characters are 2. */
/*logic to apply-keep count and strlength variable to save length and number of space count, user == operter to check if spce 
 * char is matching or not*, use for loop to iterate and increase the count on every space char occurances.*/
public class Assignment21 {
	
	int getStringLengthIfSpaceExcluded(String str) {
		int count = 0;
		int stringLength = str.length();
		for(int index=0;index<=stringLength-1;index++) {
			if(str.charAt(index)==' ') {
				count++;
			}
		}
		
		int stringLength1 = stringLength - count;
		System.out.println("Original String length is "+stringLength+ " of String "+str+" \n");
		System.out.println("String length without space is "+stringLength1+" and space characters count is "+count);
		return count;
	}
	
	public static void main(String [] args) {
	Assignment21 assignment21 = new Assignment21();
	assignment21.getStringLengthIfSpaceExcluded("prem lata gupta");
	}
}
