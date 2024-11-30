package sindhu.stringdemo;

public class Assignment23 {
	static int dCount;
	static int uCount;
	static int lCount;
	static int sCount;
	static int sPcount;

	void getStringDetails(String str) {
		for(int i=0; i<str.length(); i++) {
			
			char currentChar = str.charAt(i);
			
			boolean flag = Character.isDigit(currentChar);
			
			if(flag==true) {
				dCount++;
			}else {
				if(Character.isLetter(currentChar)) {
					if(Character.isUpperCase(currentChar)) {
						uCount++;
					}else if(Character.isLowerCase(currentChar)) {
						lCount++;
					}
				}else {
					if(currentChar == ' ') {
						sCount++;
					}else {
						sPcount++;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment23 assign23 = new Assignment23();
		assign23.getStringDetails("Te4c_hno Credi3ts");
		System.out.println("Digits:" + dCount);
		System.out.println("Uppercase letters:" + uCount);
		System.out.println("Lowercase letters:" + lCount);
		System.out.println("No. of Spaces:" + sCount);
		System.out.println("no. of Special characters:" + sPcount);
	}
}
