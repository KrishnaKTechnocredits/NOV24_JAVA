//Mock program 1
//Rearrange the string in given format input :"TecH$nO1@C12rEdiTs*" output: digits uppercase specialcahracers lowercase

package titiksha.Chararcterclass;

public class Arrangethestring {
	void getString(String str) {
		String ucase = "";
		String digit = "";
		String scharacter = "";
		String lcase = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);//we need to take char here because we need character from index //if we give int it will take ascii value of index
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				digit += ch;
			} // if character is digit store in digit
			else if (Character.isUpperCase(ch) == true) {
				ucase += ch;
			} else if (Character.isLowerCase(ch) == true) {
				lcase += ch;
			} else {
				scharacter += ch;
			}
		}
		String sum = ucase + digit + scharacter + lcase;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Arrangethestring arrangethestring = new Arrangethestring();
		arrangethestring.getString("TecH$nO1@C12rEdiTs*");

	}
}
