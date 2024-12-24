/*
Assignment - 68 : 23rd Dec (IMP) [15 mins] [7 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits

int digitSum = 0;

if(Character.isDigit(ch)){
	digitSum += Character.getNumericValue(ch);
}

return uCaseStr + digitSum + lCaseStr;
*/

package pramod.arraydemo;
class Assignment68{
	
	void printRearrangedString(String input){
		System.out.println("Given string is: " + input);
		String uCase="", lCase="";
		int digitSum=0;
		for(int i = 0; i<input.length(); i++){
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)){
				uCase +=ch;
			}
			if(Character.isLowerCase(ch)){
				lCase +=ch;
			}
			if(Character.isDigit(ch)){
				int num = Character.getNumericValue(ch);
				digitSum += num;
			}
		}
		System.out.println("Rearranged string and sum of digits as: " + uCase + digitSum + lCase);
	}
	
	public static void main(String[] args){
		Assignment68 A68 = new Assignment68();
		A68.printRearrangedString("Te1ch6NOCre4dits");
	}
}