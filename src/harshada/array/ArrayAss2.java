//Assignment - 47 : 15th Dec'2024 [12 mins]
//Print only names having length more than 6 characters from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Premlata
//Fazrana

package harshada.array;

public class ArrayAss2 {

	void print6CharNames(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > 6) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		ArrayAss2 arrayAss2 = new ArrayAss2();
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		arrayAss2.print6CharNames(names);
	}
}
