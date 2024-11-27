package prem;

public class Assignment23 {
	
	void printChar(String str) {
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int sCount=0;
		int spCount=0;
		
		for(int i=0; i<=str.length()-1; i++) {
			char ch =str.charAt(i);
			if(Character.isLetter(ch)){
				if(Character.isUpperCase(ch)){
				uCount++;
                }
			    if(Character.isLowerCase(ch)){
				lCount++;
			    }
			}
			else if(Character.isDigit(ch)){
				dCount++;
			}
			else if(Character.isWhitespace(ch)){
				sCount++;
			}else {
				spCount++;
			}
		}	
		System.out.println("Uppercase :"+ uCount);
		System.out.println("Lowercase :"+ lCount);
		System.out.println("Digit :"+ dCount);
		System.out.println("Space :"+ sCount);
		System.out.println("SpecialCharacter :"+ spCount);
	}
	
	public static void main(String[] args) {
		Assignment23 assign23 =new Assignment23();
		assign23.printChar("Te4c_hno Credi3ts");
	}

}
