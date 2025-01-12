package kishor;

import java.util.ArrayList;
//Remove all duplicate occurances of given name(Nitesh) from arrayList except last occurance. 

public class Assignment78_ArrayListOccurance {
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
		
		//doing using variable just for learning
		int firstIndex= al.indexOf("Nitesh");
		int lastIndex= al.lastIndexOf("Nitesh");
		
		while(firstIndex!= lastIndex) {
			al.remove(firstIndex);
			firstIndex= al.indexOf("Nitesh");
			lastIndex= al.lastIndexOf("Nitesh");
		}
		
		System.out.println(al);
		
	}	
}
