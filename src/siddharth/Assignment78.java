package siddharth;

import java.util.ArrayList;
import java.util.List;

/*
Assignment - 78 : 11th Jan
Remove all duplicate occurances of given name from arrayList except last occurance. (Assuming given name Nitesh) 

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
public class Assignment78 {
	
	List<String> getListRemovingDup(ArrayList<String> al, String name){
			while(al.indexOf(name)!=al.lastIndexOf(name)) {
				al.remove(name);
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
		
		Assignment78 assignment78 = new Assignment78();
		System.out.println("Input : "+al);
		System.out.println("Output : "+assignment78.getListRemovingDup(al,"Nitesh"));
	}
}
