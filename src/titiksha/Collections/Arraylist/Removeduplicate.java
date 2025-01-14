//Assignment - 77 : 11th Jan
//Remove all duplicate occurances of given name from arrayList except first occurance of niteshhj b
//output:: [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi]

package titiksha.Collections.Arraylist;

import java.util.ArrayList;

public class Removeduplicate {
	void removeDuplicatestring() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Anuja");
		name.add("Fazrana");
		name.add("Nitesh");
		name.add("Fazrana");
		name.add("Krishna");
		name.add("Nitesh");
		name.add("Fazrana");
		name.add("PremLata");
		name.add("Nitesh");
		name.add("Nitesh");
		name.add("Nitesh");
		name.add("Aashvi");

		for (int i = 0; i < name.size(); i++) {
			int indexof = name.indexOf("Nitesh");// getting first index of list
			int lastIndexof = name.lastIndexOf("Nitesh");// getting last index of list
			if (indexof != lastIndexof) {// if first index and last last index match the it is duplicate string
				name.remove(name.lastIndexOf("Nitesh"));
			}

		}
		System.out.println(name);// to find unique Strings from list
	}

	public static void main(String[] args) {
		Removeduplicate removeduplicate = new Removeduplicate();
		removeduplicate.removeDuplicatestring();
	}
}
