package kishor;

public class Assignment21_String {
	
	void lengthOfChar(String name) {
		int count1=0;
		int count2=0;
		for(int i=0;i<=name.length()-1;i++) {
			if(name.charAt(i)!=' ') {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("Length without space is "+ count1 +" and space character are "+ count2);
	}
	
	public static void main(String[] args) {
		Assignment21_String assignment22 = new Assignment21_String();
		assignment22.lengthOfChar("prem lata gupta");
	}
}
