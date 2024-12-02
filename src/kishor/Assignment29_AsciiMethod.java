package kishor;

public class Assignment29_AsciiMethod {
	
	void asciiUpperCase(char start,char end) {
		for(char ch=start;ch<=end;ch++) {
			int value = ch;
			System.out.println("The ascii value for given character "+ch+" is:-"+value);
		}
	}
	
	void asciiLowerCase(char start,char end) {
		for(char ch=start;ch<=end;ch++) {
			int value=ch;
			System.out.println("The ascii value for given character "+ch+" is:-"+value);
		}
	}
	
	void asciiDigit(int start,int end) {
		for(int i=start;i<=end;i++) {
			char ch=(char)i; //explicit type cast
			System.out.println("The ascii character of given value is "+i+" is:-"+ch);
		}
	}
	
	public static void main(String[] args) {
		Assignment29_AsciiMethod assignment29 = new Assignment29_AsciiMethod();
		assignment29.asciiUpperCase('A', 'Z');
		assignment29.asciiLowerCase('a', 'z');
		assignment29.asciiDigit(0,9);
	}
}
