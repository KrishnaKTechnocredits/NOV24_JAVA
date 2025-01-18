package anuja.collection;

import java.util.ArrayList;

/*Remove listNamesl duplicate occurances of given name from arrayList except last occurance.
*/
public class Assignment78 {

public static void main(String[] args) {
		
		ArrayList<String> listNames = new ArrayList<String>(100);
		listNames.add("Anuja");
		listNames.add("Fazrana");
		listNames.add("Nitesh");
		listNames.add("Fazrana");
		listNames.add("Krishna");
		listNames.add("Nitesh");
		listNames.add("Fazrana");
		listNames.add("PremLata");
		listNames.add("Nitesh");
		listNames.add("Nitesh");
		listNames.add("Nitesh");
		listNames.add("Aashvi");
		System.out.println("Remove listNamesl duplicate occurances of given name from arrayList except first occurance \n");
		System.out.println("input is: \n" + listNames);
		System.out.println("--------------------- \n");
		System.out.println("expected output is: \n [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi] \n");
		Assignment78  assignment78 = new Assignment78();
		assignment78.removeDuplicateKeepLastOnly(listNames);
		
			}

	private void removeDuplicateKeepLastOnly(ArrayList<String> listNames) {
		for(int i = 0 ; i<listNames.size() ; i++) {
			while(listNames.indexOf("Nitesh") != listNames.lastIndexOf("Nitesh")) {
				listNames.remove(listNames.indexOf("Nitesh"));//keep last occurance as it is, coz we removing 1st occurance
			}
			}
		System.out.println(listNames);
		}
}