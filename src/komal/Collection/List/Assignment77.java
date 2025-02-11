//Assignment - 77 : 11th Jan
//Remove all duplicate occurances of given name from arrayList except first occurance. 
//
//input : 
//ArrayList<String> al = new ArrayList<String>(100);
//		al.add("Anuja");
//		al.add("Fazrana");
//		al.add("Nitesh");
//		al.add("Fazrana");
//		al.add("Krishna");
//		al.add("Nitesh");
//		al.add("Fazrana");
//		al.add("PremLata");
//		al.add("Nitesh");
//		al.add("Nitesh");
//		al.add("Nitesh");
//		al.add("Aashvi");
//
//output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi]
package komal.Collection.List;

import java.util.ArrayList;

public class Assignment77 {

	void removeDuplicateFromList(ArrayList<String> input) {

		for (int i = 0; i < input.size(); i++) {
//			String 
//
			String currentName = input.get(i);

			while (input.indexOf(currentName) != input.lastIndexOf(currentName)) {

				int lastIndex = input.lastIndexOf(currentName);
//				System.out.println(input.indexOf(currentName) + currentName + i);
				input.remove(lastIndex);

			}
		}

		System.out.println(input);
	}

	public static void main(String args[]) {
		Assignment77 a77 = new Assignment77();
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
//		ArrayList<String> list = new ArrayList(Arrays.asList(al));

		a77.removeDuplicateFromList(al);

	}

}
