package rohan;

public class Assignment_23_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_23_1 assign = new Assignment_23_1();
		assign.count("Te4c_hno Credi3ts");
	}
	
	void count(String str) {
		int countUppercase=0,countLowerCase=0,countDigit=0,countSpace=0,countSpacialCharacor=0;
		String str1 = "",str2 = "",str3 = "",str4 = "",str5 = "";
		for(int i = 0 ; i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				str1 += str.charAt(i);
				countUppercase++;
			}
			if(Character.isLowerCase(str.charAt(i))) {
				countLowerCase++;
				str2 += str.charAt(i);
			}
			if(Character.isDigit(str.charAt(i))) {
				countDigit++;
				str3 += str.charAt(i);
			}
			if(Character.isSpaceChar(str.charAt(i))) {
				countSpace++;
				str4 += str.charAt(i);
			}
			if(!Character.isSpaceChar(str.charAt(i))&&!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))) {
				countSpacialCharacor++;
				str5 += str.charAt(i);
			}
			
			}
		System.out.println("UppercaseCount="+countUppercase+"=="+str1);
		System.out.println("LowercaseCount="+countLowerCase+"=="+str2);
		System.out.println("DigitcaseCount="+countDigit+"=="+str3);
		System.out.println("SpaceCount="+countSpace+"=="+str4);
		System.out.println("SpacialcharactorCount="+countSpacialCharacor+"=="+str5);
		}
	}


