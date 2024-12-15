package ajay;

public class Assignment29 {
	
	void upperCaseAscii() {
		for(char ch='A';ch<='Z';ch++) {
		int ascii=ch;
		System.out.println(ch +" -> " +ascii);
		}
	}
	
	void lowerCaseAscii() {
		System.out.println("---------------------------------------------------------------------");
		for(char ch='a';ch<='z';ch++) {
		int ascii=ch;
		System.out.println(ch +" -> " +ascii);
		}
	}
	
	void numberAscii() {
		System.out.println("---------------------------------------------------------------------");
		for(char i='0';i<='9';i++) {
		System.out.println(i +" -> " +(int)i);
		}
	}
	
	public static void main(String[] args) {
		Assignment29 assignment29=new Assignment29();
		assignment29.upperCaseAscii();
		assignment29.lowerCaseAscii();
		assignment29.numberAscii();
		
		
	}
}

