/*
 * Assignment - 67 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits
 */

package rohan;

public class Assignment_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_67 assignment = new Assignment_67();
		String Output = assignment.StringOrder("Te1ch6NOCre3dits");
		System.out.println("output: " + Output);
	}

	String StringOrder(String str) {
		String output = "";
		String Numoutput = "";
		String Loweroutput = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				output += str.charAt(i);
			} else if (Character.isDigit(ch)) {
				Numoutput += str.charAt(i);
			} else if (Character.isLowerCase(ch)) {
				Loweroutput += str.charAt(i);
			}
		}
		return output + Numoutput + Loweroutput;
	}

}
