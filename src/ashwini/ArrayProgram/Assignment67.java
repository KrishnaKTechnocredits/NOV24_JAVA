package ashwini.ArrayProgram;
/*
 Assignment - 67 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits

 */
public class Assignment67 {
	String rearrangementOfString(String input) {
		String uCase="";
		String lCase="";
		String digit="";
		for(int i=0;i<input.length();i++) {
			char ch= input.charAt(i);
			if(Character.isUpperCase(ch)) {
			uCase=uCase+ch;
		}else if(Character.isLowerCase(ch)) {
			lCase+=ch;
		}else
			digit+=ch;	
		}
		return uCase+digit+lCase;
	}

	public static void main(String[] args) {
		Assignment67 a67=new Assignment67();
		String input="Te1ch6NOCre3dits";
		String ans= a67.rearrangementOfString(input);
		System.out.println("Input :"+input);
		System.out.println("Output :"+ans);
		

	}

}
