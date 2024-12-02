package swapnil;

public class Assignment28 {
	
	void Char() {
		for(int Ascii=65;Ascii<=100;Ascii++) {
			char ch = (char)Ascii;
			System.out.print(" "+ch+" ");
		}
	}
	
	void Ascii() {
		
		for(char ch ='A';ch<='Z';ch++) {
			int sum= ch;
			System.out.print(" "+sum+" ");
		}	
		
	}
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.Char();
		System.out.println();
		assignment28.Ascii();

	}

}
