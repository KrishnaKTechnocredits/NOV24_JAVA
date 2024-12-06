//Assignment - 28 : 2nd Dec'2024 [20 mins]
//
//write a method to print all the characters having ascii value from 65 to 100.
//
//output : 
//65 -> A
//66 -> B 
//so on .. 
//
//write a method to print ascii values for character A to Z.
//output : 
//A -> 65
//B -> 66
//..
//..
//Z -> 90
package fazrana.ascii;

public class FAssignment28 {
	void getChar(int start,int end) {
		for(;start<=end;start++ ) {
			char ch=(char)start;
			System.out.println("Character for ascii value "+ start+" is "+ch);
		}
	}
	
	void getAscii(char start,char end) {
		for(;start<=end;start++) {
			int val= start;
			System.out.println("Ascii value for character "+start+" is "+ val);
		}
	}
	
	
	
	public static void main(String[] args) {
		FAssignment28 fassignment28=new FAssignment28();
		fassignment28.getChar(65, 100);
		fassignment28.getAscii('A', 'Z');
	}
}
