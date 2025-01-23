package reshma;
/* Remove all duplicate occurrences of given name (Nitesh) from arrayList except
  first occurrence.
  Input : ArrayList<String> al = new ArrayList<String>(); al.add("Anuja");
 al.add("Fazrana"); al.add("Nitesh"); al.add("Fazrana"); al.add("Krishna");
 al.add("Nitesh"); al.add("Fazrana"); al.add("PremLata"); al.add("Nitesh");
 al.add("Nitesh"); al.add("Nitesh"); al.add("Aashvi");
 output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi] */

import java.util.ArrayList;

public class Assignment77_RemoveDuplicateOccurence {
	
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
		System.out.println("Output :" +al);
	 	}
}
