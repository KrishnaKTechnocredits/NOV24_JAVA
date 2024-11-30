/*
 * Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. 

 */

package mayur;

public class Assignment21 {
	
	int getStringLengthWithoutSpace(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("length without space is "+(str.length()-count)+" and space characters are "+count);
		return (count);
	}
	
	public static void main(String[] args) {
		Assignment21 assign21 = new Assignment21();
		assign21.getStringLengthWithoutSpace("prem lata gupta");		
	}
}
