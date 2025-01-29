package sindhu.Comparable;

import java.util.*;   

public class BuilderSortMain {
	public static void main(String[] args) {
		ArrayList<Builder> al = new ArrayList<Builder>();
		al.add(new Builder("Paresh Raval","Pune",12, 190000.00));
		al.add(new Builder("Akash Tyagi","Banglore",17, 90000.00));
		al.add(new Builder("Aarya Paikrao","Mumbai",6, 70000.50));
		al.add(new Builder("Sindhu Patil","Hydrabad",6, 80000.90));
		
		System.out.println("Data before sorting: ");
		System.out.println(al);
		
		System.out.println();
		
		Collections.sort(al);
		
		System.out.println("Data After sorting: ");
		System.out.println(al);
	}
}
