//
//Assignment - 78 : 11th Jan
//Remove all duplicate occurances of given name from arrayList except last occurance. 
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
//output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi]

package komal.Collection.List;

import java.util.ArrayList;

public class Assignment78 {
	void removeDuplicate(ArrayList<String> input) {

		for (int i = 0; i < input.size(); i++) {
			String currentName = input.get(i);
			while (input.indexOf(currentName) != input.lastIndexOf(currentName)) {

				int currentIndex = input.indexOf(currentName);
				input.remove(currentIndex);
			}
		}
		System.out.println(input);
	}

	public static void main(String[] args) {
		Assignment78 a78 = new Assignment78();
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
		a78.removeDuplicate(al);
	}
}
