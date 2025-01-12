/*
 * /Assignment - 68 : 23rd Dec (IMP) [15 mins]
//Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.
//
//input : Te1ch6NOCre4dits
//output : TNOC11echredits

 */

package mayur;

public class Assignment68 {
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
	
	int getSumOfDigitsInString(String str) {
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))){
				sum = sum +Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment68 obj = new Assignment68();
		String input = "Te1ch6NOCre4dits";
		System.out.println(obj.getUpperCaseInString(input)+obj.getSumOfDigitsInString(input)+obj.getLowerCaseInString(input));
	}

}
