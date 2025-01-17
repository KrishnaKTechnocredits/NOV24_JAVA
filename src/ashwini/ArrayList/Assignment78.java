package ashwini.ArrayList;
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

import java.util.ArrayList;

public class Assignment78 {

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
				System.out.println("input: "+ al);
				
				while(al.indexOf("Nitesh")!=al.lastIndexOf("Nitesh")) {
					al.remove("Nitesh");
				}
				System.out.println(al);
			}
	}


