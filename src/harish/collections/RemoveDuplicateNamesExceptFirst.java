package harish.collections;

import java.util.ArrayList;

/**
 * Assignment - 77 : 11th Jan
 * 
 * Remove all duplicate occurrences of given name (Nitesh) from arrayList except
 * first occurrence.
 * 
 * Input : ArrayList<String> al = new ArrayList<String>(); al.add("Anuja");
 * al.add("Fazrana"); al.add("Nitesh"); al.add("Fazrana"); al.add("Krishna");
 * al.add("Nitesh"); al.add("Fazrana"); al.add("PremLata"); al.add("Nitesh");
 * al.add("Nitesh"); al.add("Nitesh"); al.add("Aashvi");
 * 
 * output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata,
 * Aashvi]
 */

public class RemoveDuplicateNamesExceptFirst {

	private void removeDuplicateNamesExceptFirst(ArrayList<String> input, String name) {

		while (input.indexOf(name) != input.lastIndexOf(name)) {
			input.remove(input.lastIndexOf(name)); // removing name from last index {use of remove(int index)}
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

		RemoveDuplicateNamesExceptFirst r = new RemoveDuplicateNamesExceptFirst();
		r.removeDuplicateNamesExceptFirst(al, nameToRemove);
	}
}