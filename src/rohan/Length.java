package rohan;

public class Length {

	public static void main(String[] args) {
		
		Length length = new Length();
		length.StringLength("prem lata gupta");

	}
	
	void StringLength(String string) {
		int count = 0;
		int spacecount = 0;
		for(int i=0;i<=string.length()-1;i++) {
			if(string.charAt(i) == ' ') {
				spacecount++;
			}else {
				count++;
			}
		}
		System.out.println("Length without space is "+count+" and space characters are "+spacecount);
	}

}
