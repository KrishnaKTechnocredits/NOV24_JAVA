package pratiksha;

public class Assignment21 {
	/*Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. */
	
	void getlength(String str) {
		
		int countSpace=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				
				countSpace++;
			}
		}
		System.out.println("length without space is " +(str.length()-countSpace)+" and space character are "+countSpace);
	}
public static void main(String[] args) {
	new Assignment21().getlength("prem lata gupta");
}
}
