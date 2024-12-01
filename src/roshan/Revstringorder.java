package roshan;

public class Revstringorder {
	
	static void getReverse (String str){
		for	(int index= str.length()-1 ;index>=0;index--) {
			System.out.print(str.charAt(index));}
	}
	
	public static void main(String[]args) {
		getReverse("Roshan");

	}
	
}
