package ravindra;

public class Coutn_UpperLowerSpecialDigit {
	int UpperCadeCount;
	int lowerCaseCount;
	int SpecialCaseCount;
	int digitCount;
	int spaceCount;
	void count(String str) {
		for(int i=0;i<str.length();i++) {
			char allchar=str.charAt(i);
			if(Character.isUpperCase(allchar)) {
				UpperCadeCount++;
			}
			else if(Character.isLowerCase(allchar)) {
				lowerCaseCount++;
			}
			else if(Character.isDigit(allchar)){
				digitCount++;
			}
			else if(Character.isSpace(allchar)) {
				spaceCount++;
			}
			else {
				SpecialCaseCount++;
			}
		}
	}
	
	public static void main (String []args) {
		Coutn_UpperLowerSpecialDigit coutn_UpperLowerSpecialDigit=new Coutn_UpperLowerSpecialDigit();
		coutn_UpperLowerSpecialDigit.count("Te4c_hno Credi3ts");
		System.out.println("uppercase ->"+coutn_UpperLowerSpecialDigit.UpperCadeCount);
		System.out.println("Lowercase-->"+coutn_UpperLowerSpecialDigit.lowerCaseCount);
		System.out.println("Digit-->"+coutn_UpperLowerSpecialDigit.digitCount);
		System.out.println("SpecialCharecter-->"+coutn_UpperLowerSpecialDigit.SpecialCaseCount);
		System.out.println("space-->"+coutn_UpperLowerSpecialDigit.spaceCount);
	}
}
