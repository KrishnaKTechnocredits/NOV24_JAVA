package kishor;

public class Assignment28_AsciiLoop {
	
	void displayAsciiCharacters(int start,int end) {
		for(int i=start;i<=end;i++) {
			char ch=(char)i;//explicit type cast
			System.out.println("The ascii character for given integer "+i+" is:-"+ch);
		}
	}
	
	void displayAsciiValue(char start,char end) {
		for(char ch=start;ch<=end;ch++) {
			int value=ch;
			System.out.println("The ascii value for given character "+ch+" is:-"+value);
		}
	}
	
	public static void main(String[] args) {
		Assignment28_AsciiLoop assignment28 = new Assignment28_AsciiLoop();
		assignment28.displayAsciiCharacters(65, 100);
		assignment28.displayAsciiValue('A', 'Z');
	}
}
