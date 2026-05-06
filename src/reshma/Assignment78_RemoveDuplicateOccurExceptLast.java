package reshma;
/* Remove all duplicate occurances of given name from arrayList except last
  occurance.
  Input : ArrayList<String> al = new ArrayList<String>(100); al.add("Anuja");
  al.add("Fazrana"); al.add("Nitesh"); al.add("Fazrana"); al.add("Krishna");* al.add("Nitesh"); al.add("Fazrana"); al.add("PremLata"); al.add("Nitesh");
  al.add("Nitesh"); al.add("Nitesh"); al.add("Aashvi");
  Output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi] */

import java.util.ArrayList;

public class Assignment78_RemoveDuplicateOccurExceptLast {
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
			al.remove(al.indexOf("Nitesh"));
	}
		System.out.println("Output :" +al);
 		}
}
