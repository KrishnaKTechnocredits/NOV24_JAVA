/*
Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana
*/

package amruta.ArrayPrograms;

public class Assign_47_FindStringHavingLengthMoreThan6InArray {

	void getArray(String[] arr) {
		String str = "";
		System.out.println("String having length more than 6 are : ");
		for (int index = 0; index < arr.length; index++) {
			str = arr[index];
			if (str.length() > 6) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };

		Assign_47_FindStringHavingLengthMoreThan6InArray a47 = new Assign_47_FindStringHavingLengthMoreThan6InArray();
		a47.getArray(names);
	}
}