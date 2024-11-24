package siddharth;

public class Assignment21 {
	
	int getLength(String str) {
		int count=0;
		System.out.println("Input : "+str);
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index) == ' ') {
				count++;	
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int x = new Assignment21().getLength("Prem Lata Gupta");
		System.out.println("Output : length without space is 13 and space characters are "+x);
	}
}
