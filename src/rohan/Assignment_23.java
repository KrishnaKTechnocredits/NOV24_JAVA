package rohan;

public class Assignment_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_23 assign = new Assignment_23();
		assign.count("Te4c_hno Credi3ts");
	}
	
	void count(String str) {
		int countUppercase=0,countLowerCase=0,countDigit=0,countSpace=0,countSpacialCharacor=0;
		for(int i = 0 ; i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				countUppercase++;
			}
			if(Character.isLowerCase(str.charAt(i))) {
				countLowerCase++;
			}
			if(Character.isDigit(str.charAt(i))) {
				countDigit++;
			}
			if(Character.isSpaceChar(str.charAt(i))) {
				countSpace++;
			}
			if(!Character.isSpaceChar(str.charAt(i))&&!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))) {
				countSpacialCharacor++;
			}
			
		}
		System.out.println("Uppercase="+countUppercase+" Lowecase="+countLowerCase+" Digit="+countDigit+" Space="+countSpace+" Spacialcharactor="+countSpacialCharacor);
	}

}
