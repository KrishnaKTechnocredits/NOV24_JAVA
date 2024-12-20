package rajashree;
//46.Print middle character of all the names from given String array.


public class printMiddleChar {
	void MiddleChar() {
		String[] names = {"Rohan", "Premlata","Anuja", "Fazrana"};
		for(int index=0; index<names.length; index++) {
			String str = names[index];
			int length = str.length();
			int middle = length/2;
			System.out.println(str.charAt(middle));
			}
	
	}
	public static void main(String[] args) {
		printMiddleChar ex1 = new printMiddleChar();
		ex1.MiddleChar();
	}

}
