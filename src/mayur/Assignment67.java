/*
 * //Assignment - 67 : 23rd Dec (IMP) [15 mins]
//Rearrange the given String, uppercase followed by digits followed by lowercase.
//
//input : Te1ch6NOCre3dits
//output : TNOC163echredits

 */

package mayur;

public class Assignment67 {
	
	String getUpperCaseInString(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))){
				res = res +str.charAt(i);
			}
		}
		return res;
	}
	
	String getLowerCaseInString(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))){
				res = res +str.charAt(i);
			}
		}
		return res;
	}
	
	String getNumericCharInString(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))){
				res = res +str.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Assignment67 obj = new Assignment67();
		String input = "Te1ch6NOCre3dits";
		System.out.println(obj.getUpperCaseInString(input)+obj.getNumericCharInString(input)+obj.getLowerCaseInString(input));
	}
}
