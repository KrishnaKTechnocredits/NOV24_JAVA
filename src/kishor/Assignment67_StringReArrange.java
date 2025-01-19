package kishor;
//Rearrange the given String, uppercase followed by digits followed by lowercase.
//input : Te1ch6NOCre3dits
//output : TNOC163echredits

public class Assignment67_StringReArrange {
	
	String getReArangeString(String input) {
		String Ucase="";
		String digit="";
		String Lcase="";
		
		for(int i=0;i<input.length();i++) {
			char ch= input.charAt(i);
			if(Character.isUpperCase(ch)) {
				Ucase = Ucase+ch;
			}
			else if(Character.isDigit(ch)) {
				digit = digit+ch;
			}
			else {
				Lcase = Lcase+ch;
			}
		}
		return Ucase+digit+Lcase;
	}
	
	public static void main(String[] args) {
		Assignment67_StringReArrange assignment67 = new Assignment67_StringReArrange();
		String ans=assignment67.getReArangeString("Te1ch6NOCre3dits");
		System.out.println("ReArrange String is:- "+ans);
	}
}
