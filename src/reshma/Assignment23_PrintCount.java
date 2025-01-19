package reshma;

public class Assignment23_PrintCount {
	void printcount(String str) {
		int uppercasecount=0,lowercasecount=0,digitcount=0,spacecount=0,specialcharcount=0;
		for(int i=0;i<str.length();i++) {
			if (Character.isLetter(str.charAt(i))) {
				if(Character.isUpperCase(str.charAt(i))) {
					uppercasecount++;
				}else 
				lowercasecount++;
			}else if(Character.isDigit(str.charAt(i))) {
				digitcount++;
			}else if(str.charAt(i) == ' '){
				spacecount++;
			} else {
				specialcharcount++;
		}
	}
			System.out.println("The count of upper case characters in the given string is: " + uppercasecount);
			System.out.println("The count of lower case characters in the given string is: " + lowercasecount);
			System.out.println("The count of digits in the given string is: " + digitcount);
			System.out.println("The count of spaces in the given string is: " + spacecount);
			System.out.println("The count of special characters in the given string is: " + specialcharcount);
	}
		
		public static void main(String[]args) {
			Assignment23_PrintCount assignment23=new Assignment23_PrintCount();
			String str="Te4c_hno Credi3ts";
			System.out.println("Given input is: " +str);
			assignment23.printcount(str);
	}
}
