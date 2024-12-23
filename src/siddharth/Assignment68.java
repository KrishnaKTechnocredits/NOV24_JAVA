package siddharth;
/*
Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits 
 */
public class Assignment68 {
	
	void rearrangeString(String word) {
		String output1="";
		int output2=0;
		String output3="";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
				if(Character.isUpperCase(ch)) {
					output1=output1+ch;
				}
				else if (Character.isDigit(ch)) {
					output2=output2+Character.getNumericValue(ch);
				}	
				else if(Character.isLowerCase(ch)) {
					output3=output3+ch;
				}
		}
		String output=output1+output2+output3;
		System.out.println("Output : "+output);
	}
	
	public static void main(String[] args) {
		Assignment68 assignment68 = new Assignment68();
		String input="Te1ch6NOCre4dits";
		assignment68.RearrangeString(input);
	}
}

