
/*
Assignment - 78 : 11th Jan
Remove all duplicate occurances of given name from arrayList except last occurance. 

input : 
ArrayList<String> al = new ArrayList<String>(100);
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

output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi]

*/

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class Assign_78_RemoveAllDuplicateOccurancesExcept_Last {

	// Using for loop
	void removeDuplicateOccurancesExceptLast(ArrayList<String> list, String name) {
		for (int index = 0; index < list.size(); index++) {
			int firstIndex = list.indexOf(name);
			int lastIndex = list.lastIndexOf(name);

			if (firstIndex != lastIndex) {
				list.remove(firstIndex);
			}
		}
		System.out.println("Output -- " + list);
	}

	// Using while loop
	void removeDuplicateElement(List<String> list, String name) {

		while (list.indexOf(name) != list.lastIndexOf(name)) {
			list.remove(name); // remove First Occurrence
		}
		System.out.println("Output -- " + list);
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

		System.out.println(al);
		String name = "Nitesh";

		System.out.println("\nAfter removing all occurances of Nitesh except Last : \n");
		Assign_78_RemoveAllDuplicateOccurancesExcept_Last a78 = new Assign_78_RemoveAllDuplicateOccurancesExcept_Last();
		a78.removeDuplicateOccurancesExceptLast(al, name);
		System.out.println("-------------------------------------------------------------------------------");

		ArrayList<String> li = new ArrayList<String>();
		li.add("Anuja");
		li.add("Fazrana");
		li.add("Nitesh");
		li.add("Fazrana");
		li.add("Krishna");
		li.add("Nitesh");
		li.add("Fazrana");
		li.add("PremLata");
		li.add("Nitesh");
		li.add("Nitesh");
		li.add("Nitesh");
		li.add("Aashvi");
		String name1 = "Fazrana";
		System.out.println("\nAfter removing all occurances of Fazrana except Last : \n");
		a78.removeDuplicateElement(li, name1);
	}
}