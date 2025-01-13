package anuja.collection;

import java.util.ArrayList;

/*
Remove all duplicate occurances of given name from arrayList except first occurance. 

output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi] 
 * */
public class Assignment77 {

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
		System.out.println("Remove all duplicate occurances of given name from arrayList except first occurance \n");
		System.out.println("input is: \n" + al);
		System.out.println("--------------------- \n");
		System.out.println("expected output is: \n [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi] \n");
		Assignment77  assignment77 = new Assignment77();
		assignment77.removeDuplicateKeepFirstOccurance(al);
		
			}

	private void removeDuplicateKeepFirstOccurance(ArrayList<String> names) {
		for(int i = 0 ; i<names.size() ; i++) {
			while(names.indexOf("Nitesh") != names.lastIndexOf("Nitesh")) {
				names.remove(names.lastIndexOf("Nitesh"));//keep 1st occurance as it, coz we removing lastindexof
			}
			}
		System.out.println(names);
		}

}
