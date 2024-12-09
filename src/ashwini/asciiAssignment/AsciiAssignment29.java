package ashwini.asciiAssignment;

public class AsciiAssignment29 {
	void getAsciiCharacter(char ch1) {
		int ascii1= ch1;
		System.out.println(ch1 + " is represented by ascii value " + ascii1);
	}
	void getAsciiCharacters(char ch2) {
		int ascii2= ch2;
		System.out.println(ch2 + " is represented by ascii value " + ascii2);
	}
	void getAsciiCharacterss(int ascii3) {
		char ch3= (char)ascii3;
		System.out.println(ch3+ " is represented by ascii value " + ascii3);
	}

	public static void main(String[] args) {
		AsciiAssignment29 assn29= new AsciiAssignment29();
		for(int ch1 ='A';ch1<= 'Z'; ch1++) {
			assn29.getAsciiCharacter((char)ch1);
		}
		for(int ch2 ='a';ch2<= 'z'; ch2++) {
			assn29.getAsciiCharacters((char)ch2);
		}
		for(int ch3 ='0';ch3<= '9'; ch3++) {
			assn29.getAsciiCharacterss((char)ch3);
		}

}
}
