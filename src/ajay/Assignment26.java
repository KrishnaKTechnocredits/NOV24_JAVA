package ajay;

public class Assignment26 {
	
	void asciivalue(char ch) {
		
		int asciiValue=(int) ch;
		System.out.println("Ascii value for Given characters are =" +asciiValue);
	}

	public static void main(String[] args) {
		
		Assignment26 assignment26=new Assignment26();
		assignment26.asciivalue('A');
		assignment26.asciivalue('x');
		assignment26.asciivalue(' ');
		assignment26.asciivalue('.');
		
	}

}
