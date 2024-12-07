package imran.character_class_Program;

public class Assignment26_ReturnASCIIvalue {

	void getASCIIChar(char ch)
	{
		int k= ch;
		System.out.println("The ASCII value of the given Character " + ch+ " is :" + k);
	}
	
	public static void main(String[] args) {
		Assignment26_ReturnASCIIvalue assignment26_ReturnASCIIvalue_1 = new Assignment26_ReturnASCIIvalue();
		assignment26_ReturnASCIIvalue_1.getASCIIChar('A');
		assignment26_ReturnASCIIvalue_1.getASCIIChar('x');
		assignment26_ReturnASCIIvalue_1.getASCIIChar(' ');
		assignment26_ReturnASCIIvalue_1.getASCIIChar('.');
	}
}
