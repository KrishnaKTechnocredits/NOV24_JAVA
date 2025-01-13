package siddharth;

import java.util.ArrayList;
import java.util.List;

/*
Assignment - 77 : 11th Jan
Remove all duplicate occurances of given name from arrayList except first occurance. (Assuming given name Nitesh)

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
public class Assignment77 {
	
	List<String> getListRemovingDup(ArrayList<String> al, String name){
			while(al.indexOf(name)!=al.lastIndexOf(name)) {
				al.remove(al.lastIndexOf(name));
			}
		return al;
	}
	
	public static void main(String[] args) {
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
		
		Assignment77 assignment77 = new Assignment77();
		System.out.println("Input : "+al);
		System.out.println("Output : "+assignment77.getListRemovingDup(al,"Nitesh"));
	}
}
