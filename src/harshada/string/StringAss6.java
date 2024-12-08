//Assignment 24Print count of uppercase, lowercase, digit, space and special characters in given input string.
//
//Friends,
//Just a small thing: In the above program, along with the count of each type of letters, can you also print those letters?
//Like, I'm expecting the output as follows:
//uppercase -> 2 
//TC
//
//lowercase -> 11
//echnoredits
//
//digit -> 2
//43
//
//space -> 1
//
//special char -> 1

package harshada.string;

public class StringAss6 {
	
	int upperCnt, lowerCnt, digitCnt, spaceCnt, specailCharCnt;
	String upperCase="", lowerCase="", digit="",space="", specialChar="";
	
	void findDiffCountInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)){
					upperCase+=ch;
					upperCnt++;
				}
				else {
					lowerCase+=ch;
					lowerCnt++;
				}
			} else if (Character.isDigit(ch)) {
				digit+=ch;
				digitCnt++;
			} else if (ch == ' ') {
				space+=ch;
				spaceCnt++;
			} else {
				specialChar+=ch;
				specailCharCnt++;
			}
		}
	}
	
	public static void main(String[] args) {
		StringAss6 stringAss6=new StringAss6();
		stringAss6.findDiffCountInString("Te4c_hno Credi3ts");
		System.out.println("uppercase -> " + stringAss6.upperCnt);
		System.out.println(stringAss6.upperCase);
		System.out.println("lowercase -> " + stringAss6.lowerCnt);
		System.out.println(stringAss6.lowerCase);
		System.out.println("digit -> " + stringAss6.digitCnt);
		System.out.println(stringAss6.digit);
		System.out.println("space -> " + stringAss6.spaceCnt);
		System.out.println("'"+stringAss6.space+"'");
		System.out.println("special char -> " + stringAss6.specailCharCnt);
		System.out.println(stringAss6.specialChar);
	}
}
