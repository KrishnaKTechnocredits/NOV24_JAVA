package ravindra;

import java.util.ArrayList;

public class Assignment_77 {
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
		System.out.println(al);
		
		while(al.indexOf("Nitesh") != al.lastIndexOf("Nitesh")) {
			al.remove(al.lastIndexOf("Nitesh"));
		}
		System.out.println(al);
	}
}
