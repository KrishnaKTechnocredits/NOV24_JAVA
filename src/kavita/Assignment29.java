package kavita;
/*Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).*/
/*Time:10m*/
public class Assignment29 {
	void asciiForUpperCaseChar(String str) {
		for(int i=0;i<str.length();i++){
			int ascii=str.charAt(i);
			System.out.println("Ascii value for uppercase(A-Z) is "+ascii);
		} 
	}
	
	void asciiForLowerCaseChar(String str) {
		for(int i=0;i<str.length();i++){
			int ascii=str.charAt(i);
			System.out.println("Ascii value for lowercase(a-z) is "+ascii);
		} 
	}
	
	void asciiForDigits(String str) {
		for(int i=0;i<str.length();i++){
			int ascii=str.charAt(i);
			System.out.println("Ascii value for digit(0-9) is "+ascii);
		} 
	}
	
	public static void main(String[] args) {
		Assignment29 assignment29=new Assignment29();
		String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		assignment29.asciiForUpperCaseChar(uppercase);
		System.out.println("----------------------------");
		String lowercase="abcdefghijklmnopqrstuvwxyz";
		assignment29.asciiForLowerCaseChar(lowercase);
		System.out.println("----------------------------");
		String digit="0123456789";
		assignment29.asciiForDigits(digit);
	}
}
