package imran.character_class_Program;

public class Assignment28_ReturnCharacterAndValue {

	void getCharacter()
	{
		for(int i=65;i<=100;i++)
		{
			char ch= (char)i;
			System.out.println("The Character representing the Value :"+ i+ " is "+ ch);
		}
	}
	
	void getValue()
	{
		for(int i='A'; i<='Z';i++)
		{
			char ch = (char)i;
			int val = i;
			System.out.println("The Value of a Given Charatcter "+ ch + " is "+ val);
		}
	}
	
	public static void main(String[] args) {
		Assignment28_ReturnCharacterAndValue assignment28_ReturnCharacterAndValue_1 = new Assignment28_ReturnCharacterAndValue();
		assignment28_ReturnCharacterAndValue_1.getCharacter();
		assignment28_ReturnCharacterAndValue_1.getValue();
	}
}
