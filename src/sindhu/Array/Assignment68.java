/*Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits
*/

package sindhu.Array;

public class Assignment68 {
	
	String getUpperDigitsLower(String str) {
		String upperStr = "";
		int digitStr = 0;
		String lowerStr = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperStr += ch;
			}else if(Character.isDigit(ch)) {
				digitStr += Character.getNumericValue(ch);
			}else if(Character.isLowerCase(ch)) {
				lowerStr += ch;
			}
		}
		
		return upperStr+digitStr+lowerStr;
	}
	
	public static void main(String[] args) {
		String str = "Te1ch6NOCre4dits";
		Assignment68 assign68 = new Assignment68();
		String outputStr = assign68.getUpperDigitsLower(str);
		System.out.println("The rearranged string is: "+outputStr);
	}
}
