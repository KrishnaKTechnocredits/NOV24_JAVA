package imran.character_class_Program;

public class Assignment27_ReturnCharacterofValue {

	void getASCIIValue(int val)
	{
		char ch = (char)val;
		System.out.println("The Character representation of Value : "+ val +" is "+ ch);
	}
	
	public static void main(String[] args) {
		Assignment27_ReturnCharacterofValue assignment27_ReturnCharacterofValue_1  = new Assignment27_ReturnCharacterofValue();
		assignment27_ReturnCharacterofValue_1.getASCIIValue(65);
		assignment27_ReturnCharacterofValue_1.getASCIIValue(90);
		assignment27_ReturnCharacterofValue_1.getASCIIValue(55);
	}
}
