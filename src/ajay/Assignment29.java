package ajay;

public class Assignment29 {
	
	void upperCaseAscii() {
		for(char ch='A';ch<='Z';ch++) {
		int ascii=(char)ch;
		System.out.println(ch +" -> " +ascii);
		}
	}
	
	void lowerCaseAscii() {
		System.out.println("---------------------------------------------------------------------");
		for(char ch='a';ch<='z';ch++) {
		int ascii=(char)ch;
		System.out.println(ch +" -> " +ascii);
		}
	}
	
	void numberAscii() {
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<=9;i++) {
		int ascii=(int)i;
		System.out.println(i +" -> " +ascii);
		}
	}
	
	public static void main(String[] args) {
		Assignment29 assignment29=new Assignment29();
		assignment29.upperCaseAscii();
		assignment29.lowerCaseAscii();
		assignment29.numberAscii();
		
		
	}
}

