package siddharth;
/*
Assignment - 67 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits
 */
public class Assignment67 {
	
	void rearrangeString(String word) {
		String output1="";
		String output2="";
		String output3="";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
				if(Character.isUpperCase(ch)) {
					output1=output1+ch;
				}
				else if (Character.isDigit(ch)) {
					output2=output2+ch;
				}	
				else if(Character.isLowerCase(ch)) {
					output3=output3+ch;
				}
		}
		String output=output1+output2+output3;
		System.out.println("Output : "+output);
	}
	
	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		String input="Te1ch6NOCre3dits";
		assignment67.RearrangeString(input);
	}
}
