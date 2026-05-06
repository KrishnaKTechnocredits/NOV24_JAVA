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


package pratiksha;

import java.util.ArrayList;
import java.util.List;

public class Assignment77 {
	
	List<String> removeName(String name, List<String> arrayList) {
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			String name1 = arrayList.get(i);
			if (name1 == name) {
				if (arrayList.lastIndexOf(name) != arrayList.indexOf(name)) {
					arrayList.remove(arrayList.lastIndexOf(name));
				}
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		Assignment77 assignment77 = new Assignment77();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Anuja");
		arrayList.add("Fazrana");
		arrayList.add("Nitesh");
		arrayList.add("Fazrana");
		arrayList.add("Krishna");
		arrayList.add("Nitesh");
		arrayList.add("Fazrana");
		arrayList.add("PremLata");
		arrayList.add("Nitesh");
		arrayList.add("Nitesh");
		arrayList.add("Nitesh");
		arrayList.add("Aashvi");
		System.out.println("Input: " + arrayList);
		System.out.println("Output: " + assignment77.removeName("Nitesh", arrayList));
	}
}


