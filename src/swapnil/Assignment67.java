package swapnil;

public class Assignment67 {
	
	String rearrangechar(String str) {
		String uCase ="";
		String lCase ="";
		String dCase ="";
		
		for(int i=0;i<str.length()-1;i++) {
			
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uCase+=ch;
			}
			else if(Character.isLowerCase(ch)) {
				lCase+=ch;
			}
			else if(Character.isDigit(ch)) {
				dCase+=ch;
			}
			
		}
		return uCase+dCase+lCase;
		
	}

	public static void main(String[] args) {
		String input = "Te1ch6NOCre3dits";
		Assignment67 a = new Assignment67();
		String output=a.rearrangechar(input);
		System.out.println(output);

	}

}
