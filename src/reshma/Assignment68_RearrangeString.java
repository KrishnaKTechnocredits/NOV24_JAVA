package reshma;
/* Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.
input : Te1ch6NOCre4dits
output : TNOC11echredits */

public class Assignment68_RearrangeString {
	void RearrangeString( String input) {
		String UpperCase="", LowerCase="";
		int SumOfDigits=0;
		for(int i=0 ; i<input.length(); i++){
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)){
				UpperCase += ch;
			}
			if(Character.isLowerCase(ch)){
				LowerCase +=ch;
			}
			if(Character.isDigit(ch)){
				int Digits  = Character.getNumericValue(ch);
				SumOfDigits +=Digits ;
			}
		}
		System.out.println("After Rearrange string is: "+UpperCase + SumOfDigits + LowerCase);
	}
	public static void main(String[] args) {
		Assignment68_RearrangeString a68=new Assignment68_RearrangeString();
		String input="Te1ch6NOCre4dits";
		a68.RearrangeString(input);
	}
}
