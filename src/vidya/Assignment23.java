package vidya;

public class Assignment23 {
	void countAllChar(String str) {
		int uccount = 0; //uppercase
		int lccount = 0; //lowercase
		int dcount = 0; //digit
		int spcount = 0; //space
		int sccount = 0; // special character
		
		
		for(int i = 0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uccount++;
				}
				else
					if(Character.isLowerCase(ch)) {
						lccount++;
			}
					else
						if(Character.isDigit(ch)) {
							dcount++;}
							else
								if(str.charAt(i)==' ') {
									spcount++;}
									else {
										sccount++;
									}
	}
		System.out.println("Uppercase letters: " + uccount);
		System.out.println("Lowercase letters: " + lccount);
		System.out.println("Digits: " + dcount);
		System.out.println("Spaces: " + spcount);
		System.out.println("Special character: " + sccount);
	}
							
	
	public static void main(String[] args) {
		Assignment23 ca = new Assignment23();
		ca.countAllChar("Te4c_hno Credi3ts");
		
	}
}
