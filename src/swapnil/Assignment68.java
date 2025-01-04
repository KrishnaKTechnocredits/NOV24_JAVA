package swapnil;

public class Assignment68 {

	String rearrangechar(String str) {
		String uCase ="";
		String lCase ="";
		int dCase =0;
		
		for(int i=0;i<str.length()-1;i++) {
			
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uCase+=ch;
			}
			else if(Character.isLowerCase(ch)) {
				lCase+=ch;
			}
			else if(Character.isDigit(ch)) {
				int a = Character.getNumericValue(ch);
				dCase=dCase+a;
			}
			
		}
		return uCase+dCase+lCase;
		
	}

	public static void main(String[] args) {
		String input = "Te1ch6NOCre4dits";
		Assignment68 a = new Assignment68();
		String output=a.rearrangechar(input);
		System.out.println(output);

	}

}
