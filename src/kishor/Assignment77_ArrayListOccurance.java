package kishor;

import java.util.ArrayList;
//Remove all duplicate occurances of given name(Nitesh) from arrayList except first occurance. 

public class Assignment77_ArrayListOccurance {

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

		while (al.indexOf("Nitesh") != al.lastIndexOf("Nitesh")) {
			al.remove(al.lastIndexOf("Nitesh"));
		}
		System.out.println(al);
	}
}
