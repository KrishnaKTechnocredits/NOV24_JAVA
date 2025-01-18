package ravindra;

import java.util.ArrayList;

public class RemoveAllDuplicateAccuranceOfGivenName_78 {
	public static void main(String[] args) {
		ArrayList<String> listofname=new ArrayList<>();
		listofname.add("Anuja");
		listofname.add("Fazrana");
		listofname.add("Nitesh");
		listofname.add("Fazrana");
		listofname.add("Krishna");
		listofname.add("Nitesh");
		listofname.add("Fazrana");
		listofname.add("PremLata");
		listofname.add("Nitesh");
		listofname.add("Nitesh");
		listofname.add("Nitesh");
		listofname.add("Aashvi");
		
		System.out.println(listofname);
		
		while(listofname.indexOf("Nitesh") != listofname.lastIndexOf("Nitesh")) {
			listofname.remove("Nitesh");
		}
		System.out.println(listofname);
	}
}
