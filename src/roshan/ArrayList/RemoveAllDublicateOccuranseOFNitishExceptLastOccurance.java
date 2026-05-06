package roshan.ArrayList;

import java.util.*;

public class RemoveAllDublicateOccuranseOFNitishExceptLastOccurance {
	void RemoveallFirstoccuranseOfNitesh(List<String> al, String Name) {
		while (al.indexOf(Name) != al.lastIndexOf(Name)) {
			al.remove(Name); // remove first occurance as speciic object is given
		}

	}

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
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

		String name = "Nitesh";
		RemoveAllDublicateOccuranseOFNitishExceptLastOccurance removelastoccurance = new RemoveAllDublicateOccuranseOFNitishExceptLastOccurance();
		removelastoccurance.RemoveallFirstoccuranseOfNitesh(al, name);
		System.out.println(al);
	}

}

/*
 * Assignment - 78 : 11th Jan Remove all duplicate occurances of given name from
 * arrayList except last occurance. Remove all duplicate occurrence of given
 * name from list and keep 1st one and remove last one.
 * 
 * input : ArrayList<String> al = new ArrayList<String>(100); al.add("Anuja");
 * al.add("Fazrana"); al.add("Nitesh"); al.add("Fazrana"); al.add("Krishna");
 * al.add("Nitesh"); al.add("Fazrana"); al.add("PremLata"); al.add("Nitesh");
 * al.add("Nitesh"); al.add("Nitesh"); al.add("Aashvi");
 * 
 * output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh,
 * Aashvi]
 */
