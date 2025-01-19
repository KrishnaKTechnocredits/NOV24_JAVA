package mayur;

public class Assignment32additional {
	
	void displayCharFreq(String str) {
			
			for (int i = 0;  i < str.length(); i++) {
				char ch = str.charAt(i);
				if (str.indexOf(ch)==i) {
					int count=0;
					for (int j = 0; j < str.length();j++) {
						if (str.charAt(j) == ch) {
							count++;
						}
					}
					System.out.println("count of character -"+ch+" --> "+count);
				}
			}
		}
		
	void displayUpperCaseCharFreq(String str) {
				
		for (int i = 0;  i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((Character.isLetter(ch)) && Character.isUpperCase(ch)) {
				if (str.indexOf(ch)==i) {
					int count=0;
					for (int j = 0; j < str.length();j++) {
						if (str.charAt(j) == ch) {
							count++;
						}
					}
					System.out.println("count of character -"+ch+" --> "+count);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment32additional assign32 = new Assignment32additional();
		assign32.displayCharFreq("aakanksha");
		assign32.displayUpperCaseCharFreq("MAyuRKIranWAni");
	}

}
