package kishor;
//Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.
//input : Te1ch6NOCre4dits
//output : TNOC11echredits

public class Assignment68_ReArrangeString {
	
	String getReArrangeString(String input) {
		String uCase="";
		String lCase="";
		int digit =0;
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				uCase = uCase+ch;
			}
			else if(Character.isDigit(ch)) {
				int num=Character.getNumericValue(ch);
				digit = digit+num;
			}
			else {
				lCase =lCase+ch;
			}
		}
		return uCase+digit+lCase;
	}
	
	public static void main(String[] args) {
		Assignment68_ReArrangeString assignment68 = new Assignment68_ReArrangeString();
		String ans=assignment68.getReArrangeString("Te1ch6NOCre4dits");
		System.out.println(ans);
		
	}
}
