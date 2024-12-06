package rohan;

public class Assignment_29 {

	int OutputAscii(char first , char last){
		int AsciiValue=0;
		for(char i= first; i<= last;i++){
			AsciiValue = (int)i;
			System.out.println(i+"->"+AsciiValue);
			
		}
		return AsciiValue;
	}
	
	public static void main(String[] args ){
		Assignment_29 a = new Assignment_29();
		System.out.println("For Upper case");
		a.OutputAscii('A','Z');
		System.out.println("\n"+"For Lower case");
		a.OutputAscii('a','z');
		System.out.println("\n"+"For digit case");
		a.OutputAscii('0','9');
	}
}
