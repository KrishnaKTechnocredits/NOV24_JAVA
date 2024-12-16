package anuja.array1;
/*practice basic print length of array */
public class Test1 {

	public void getArrayName() {
		
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for (int i = 0 ; i<= names.length-1 ; i++) {
			//int strLeng= names[i].length();
			System.out.println(names[i]+" ->  "+names[i].length());

		}
		
	}
	
	public static void main(String[] args) {
		Test1 a = new Test1();
		a.getArrayName();
	}
}
