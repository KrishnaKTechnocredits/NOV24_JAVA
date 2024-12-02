//Assignment - 29 : 2nd Dec'2024 [20 mins]
//write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
//-----------------------

package fazrana.ascii;

public class FAssignment29 {
	void getAscii(char start,char end) {
		for(;start<=end;start++) {
			int val= start;
			System.out.println("Ascii value for character "+start+" is "+ val);
		}
	}
	
	public static void main(String[] args) {
		FAssignment29 fassignment29=new FAssignment29();
		fassignment29.getAscii('A', 'Z');
		fassignment29.getAscii('a', 'z');
		fassignment29.getAscii('0', '9');
	}
}
