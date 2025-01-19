package krishna;

public class Assignment29 {

	int getAsciiValue(char ch) {
		return ch;
	}
	
	public static void main(String[] args) {
		Assignment29 demo = new Assignment29();
		
		for(char ch = 'A';ch<='Z';ch++) {
			System.out.println("Ascii value of given character ,"+ ch +" is : "+ demo.getAsciiValue(ch));
		}
		
		System.out.println("\n");
		
		for(char ch = 'a';ch<='z';ch++) {
			System.out.println("Ascii value of given character ,"+ ch +" is : "+ demo.getAsciiValue(ch));
		}
		
		System.out.println("\n");
		
		for(char ch = '0';ch<='9';ch++) {
			System.out.println("Ascii value of given character ,"+ ch +" is : "+ demo.getAsciiValue(ch));
		}
	}
	
}
