package reshma;

public class Assignment24_PrintCountwithChar {
		int UpperCaseCount=0;
		int LowerCaseCount=0;
		int DigitCount=0;
		int SpaceCount=0;
		int SpecialCharCount=0;
		String UpperCaseChar=" ";
		String LowerCaseChar=" ";
		String Digit=" ";
		String Space=" ";
		String SpecialChar=" ";
		char ch;
		
		void getCountwithChar(String str) {
			for(int i=0;i<str.length();i++) {
			 ch=str.charAt(i);
				if(Character.isUpperCase(ch)) {
						UpperCaseCount++;
						UpperCaseChar += ch;
					}else if(Character.isLowerCase(ch)) {	
						LowerCaseCount++;
						LowerCaseChar += ch;
				}else if(Character.isDigit(ch)){
					 DigitCount++;
					 Digit += ch;
				}else if(Character.isSpace(ch)){
					SpaceCount++;
					Space += ch;
				}else {
					SpecialCharCount++;
				    SpecialChar += ch;
				}
			}
			System.out.println("UpperCaseCount & Char in given input is: " +UpperCaseCount+ "-" +UpperCaseChar);
			System.out.println("LowerCaseCount & Char in given input is: " +LowerCaseCount+ "-" +LowerCaseChar);
			System.out.println("DigitCount & Digit in given input is: " +DigitCount+ "-" +Digit);
			System.out.println("SpaceCount & Space in given input is: " +SpaceCount+  Space);
			System.out.println("SpecialCharCount & SpecialChar in given input is: " +SpecialCharCount+ "-" +SpecialChar);
			}
		
		public static void main(String[] args) {
			Assignment24_PrintCountwithChar assignment24=new Assignment24_PrintCountwithChar();
			String str="Te4c_hno @Credi3ts";
			System.out.println("Given input is: " +str);
			assignment24.getCountwithChar(str);
		}
}

