package akashL;

public class Aakash_Assignment19 {
	void printRevChar(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		
	}
	public static void main(String[] args) {
		String rev="te ch3no";
		Aakash_Assignment19 aakash_Assignment19=new Aakash_Assignment19();
		aakash_Assignment19.printRevChar(rev);
	}
}
