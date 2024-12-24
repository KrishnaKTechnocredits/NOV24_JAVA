/*
Assignment - 67 : 23rd Dec (IMP) [15 mins] [10 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits

*/

package pramod.arraydemo;
class Assignment67 {
	
	void printStringInRearranedFormat(String input){
		System.out.println("Given string is: "+ input);
		String uCase = "", lCase="", digits="";
		for(int i=0 ; i<input.length(); i++){
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)){
				uCase +=ch;
			}
			if(Character.isLowerCase(ch)){
				lCase +=ch;
			}
			if(Character.isDigit(ch)){
				int conDigits = Character.getNumericValue(ch);
				digits += conDigits;
			}
		}
		System.out.println("Rearranged string is: "+ uCase + digits+ lCase);
	}
		
	public static void main(String[] args){
		Assignment67 A67=new Assignment67();
		A67.printStringInRearranedFormat("Te1ch6NOCre3dits");
	}
}