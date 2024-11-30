//Find the length of the given string excluding space. 
//
//input : prem lata gupta
//output : length without space is 13 and space characters are 2. 
package fazrana;

public class FAssignment21 {
	void getlength(String str) {
		int countSpace=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				countSpace++;
			}
		}
		System.out.println("length without space is "+(str.length()-countSpace)+" and space characters are "+countSpace);
	}
	
	public static void main(String[] args) {
		new FAssignment21().getlength("Prem Lata Gupta");	
	}
}
