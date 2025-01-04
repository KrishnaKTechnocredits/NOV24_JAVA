package anuja.string;
/*
Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits
if(Character.isDigit(ch)){
	digitSum += Character.getNumericValue(ch);
}

return uCaseStr + digitSum + lCaseStr;*/
public class Assignment68 {
	
	void printRearrangedString(String input) {
		int sum = 0;
		String lowerStr = "";
		String upperStr = "";
		System.out.println("Given string is: " + input +"\n"+"------------------------------\n");
		
		for(int i = 0 ; i<input.length() ; i++) {
			char ch= input.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperStr += ch;
			}
			
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
			
			if(Character.isLowerCase(ch)) {
				lowerStr += ch;
			}
		}
		System.out.println("Output String is: \n" +upperStr+sum+lowerStr);
	}
	
	public static void main(String[] args) {
		Assignment68 assignment68 = new Assignment68();
		String name = "Te1ch6NOCre4dits";
		assignment68.printRearrangedString(name);
	}
}
