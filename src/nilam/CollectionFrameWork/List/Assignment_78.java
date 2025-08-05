package nilam.CollectionFrameWork.List;

import java.util.ArrayList;

//Remove all duplicate occurrences of given name from arrayList except last occurrence. 
public class Assignment_78 {
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
		for(int index=0;index<al.size();index++) {
			String name=al.get(index);
				while(al.indexOf(name)!=al.lastIndexOf(name)) {
				al.remove(al.indexOf(name));			
			}
		}
		System.out.println(al);
	}
}
