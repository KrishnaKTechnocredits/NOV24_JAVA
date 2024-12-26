package anuja.string;
/*
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits*/
public class Assignment67 {

	void updateString(String name) {
		System.out.println("Input String is: " +name +"\n"+"-------------------------------------------");
		String expectedStr = "TNOC163echredits";
		System.out.println("Expected String is: " +expectedStr +"\n"+"------------------------------------");
		//save three temporary variable to store sum , upperstr, lower str
		String digits = ""; 
		String upperStr = "";
		String lowerStr = "";
		
		for(int i = 0 ; i<name.length() ; i++) {
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperStr += ch;
			}
			//make sure to get the numric value
			if(Character.isDigit(ch)) {
				digits = digits + ch;
			}

			
			if(Character.isLowerCase(ch)) {
				lowerStr += ch;
			}
		}
		System.out.println("Output is: " +upperStr+digits+lowerStr);
	}
	
	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		String input  = "Te1ch6NOCre3dits";
		assignment67.updateString(input);
	}
}
