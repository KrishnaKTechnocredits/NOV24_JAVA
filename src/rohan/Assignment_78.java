/*
 * Assignment - 77 : 11th Jan
Remove all duplicate occurances of given name from arrayList except first occurance. 

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

output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi]

 */
package rohan;

import java.util.*;

public class Assignment_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_78 assignment = new Assignment_78();
		ArrayList<String> output = assignment.AddElement();
		assignment.RemoveDuplicateFromFirstIndex(output);
	}

	ArrayList<String> AddElement() {
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

		return al;

	}
	void RemoveDuplicateFromFirstIndex(ArrayList<String> al) {
		for(int i=0;i< al.size();i++) {
			String name = al.get(i);
			while(al.indexOf(name)!=al.lastIndexOf(name) ) {
				al.remove(name);
			}
		}
		System.out.println(al);
	}
	

}
