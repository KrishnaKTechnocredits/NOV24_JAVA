package siddharth;

public class Assignment21 {
	
	void getLength(String str) {
		int length=0;
		int count=0;
		System.out.println("Input : "+str);
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index) == ' ') {
				count++;	
			}
			length = str.length()-count;
		}
		System.out.println("Output : length without space is "+length+" and space characters are "+count);
	}
	
	public static void main(String[] args) {
		new Assignment21().getLength("Prem Lata Gupta");
	}
}
