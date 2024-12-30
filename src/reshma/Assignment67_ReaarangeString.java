package reshma;
/* Rearrange the given String, uppercase followed by digits followed by lowercase.
input : Te1ch6NOCre3dits
output : TNOC163echredits */ 

public class Assignment67_ReaarangeString {
	void RearrangeString( String input) {
		String UpperCase="", LowerCase="", Digits="";
		for(int i=0 ; i<input.length(); i++){
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)){
				UpperCase += ch;
			}
			if(Character.isLowerCase(ch)){
				LowerCase +=ch;
			}
			if(Character.isDigit(ch)){
				int numDigits  = Character.getNumericValue(ch);
				Digits +=numDigits ;
			}
		}
		System.out.println("After Rearrange string is: "+UpperCase + Digits + LowerCase);
	}
	public static void main(String[] args) {
		Assignment67_ReaarangeString a67=new Assignment67_ReaarangeString();
		String input="Te1ch6NOCre3dits";
		a67.RearrangeString(input);
	}
}
