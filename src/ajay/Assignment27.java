package ajay;

public class Assignment27 {
	
	void findcharfromAscii(int input) {
		
		char ch=(char) input;
		System.out.println("Character for Given Ascii Values are = "+ch);
		
	}

	public static void main(String[] args) {
		Assignment27 assignment27=new Assignment27();
		assignment27.findcharfromAscii(65);
		assignment27.findcharfromAscii(90);
		assignment27.findcharfromAscii(55);
	}

}
