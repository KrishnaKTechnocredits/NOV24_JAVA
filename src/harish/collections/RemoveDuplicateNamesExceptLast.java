package harish.collections;

import java.util.ArrayList;

/**
 * Assignment - 78 : 11th Jan
 * 
 * Remove all duplicate occurances of given name from arrayList except last
 * occurance.
 * 
 * Input : ArrayList<String> al = new ArrayList<String>(100); al.add("Anuja");
 * al.add("Fazrana"); al.add("Nitesh"); al.add("Fazrana"); al.add("Krishna");
 * al.add("Nitesh"); al.add("Fazrana"); al.add("PremLata"); al.add("Nitesh");
 * al.add("Nitesh"); al.add("Nitesh"); al.add("Aashvi");
 * 
 * Output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh,
 * Aashvi]
 */

public class RemoveDuplicateNamesExceptLast {

	private void removeDuplicateNamesExceptLast(ArrayList<String> input, String name) {

		while (input.indexOf(name) != input.lastIndexOf(name)) {
			input.remove(name); // remove(Object obj) always removes the first occurrence
		}

		System.out.println("Output : " + input);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anuja");
		al.add("Fazrana");
		al.add("Nitesh");
		al.add("Fazrana");
		al.add("Krishna");
		al.add("Nitesh");
		al.add("Fazrana");
		al.add("PremLata");
		al.add("Nitesh");
		al.add("Nitesh");
		al.add("Nitesh");
		al.add("Aashvi");

		System.out.println("Input : " + al);
		String nameToRemove = "Nitesh";

		RemoveDuplicateNamesExceptLast r = new RemoveDuplicateNamesExceptLast();
		r.removeDuplicateNamesExceptLast(al, nameToRemove);
	}
}