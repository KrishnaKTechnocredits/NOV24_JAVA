/*Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits*/

package sindhu.Array;

public class Assignment67 {
	
	String getUpperDigitsLower(String str) {
		String upperStr = "";
		String digitStr = "";
		String lowerStr = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperStr += ch;
			}else if(Character.isDigit(ch)) {
				digitStr += ch;
			}else if(Character.isLowerCase(ch)) {
				lowerStr += ch;
			}
		}
		
		return upperStr+digitStr+lowerStr;
	}
	
	public static void main(String[] args) {
		String str = "Te1ch6NOCre3dits";
		Assignment67 assign67 = new Assignment67();
		String outputStr = assign67.getUpperDigitsLower(str);
		System.out.println("The rearranged string is: "+outputStr);
	}
}
