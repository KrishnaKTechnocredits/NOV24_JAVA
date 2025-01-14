//Assignment - 78 : 11th Jan
//Remove all duplicate occurances of given name from arrayList except last occurance. 
//output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi]

package titiksha.Collections.Arraylist;
import java.util.ArrayList;
import java.util.List;

public class Removeduplicatefromstart {
	
	void Returnlist() {
	List<String> names=new ArrayList<String>(); {
	names.add("Anuja");
	names.add("Fazrana");
	names.add("Nitesh");
	names.add("Fazrana");
	names.add("Krishna");
	names.add("Nitesh");
	names.add("Fazrana");
	names.add("PremLata");
	names.add("Nitesh");
	names.add("Nitesh");
	names.add("Nitesh");
	names.add("Aashvi");
	for(int i=names.size()-1;i>0;i--) {
		int index=names.indexOf("Nitesh");
		int lastIndex=names.lastIndexOf("Nitesh");
		if(index !=lastIndex) {
			names.remove(names.indexOf("Nitesh"));
		}
	}
	System.out.println(names);
}
	}
	public static void main(String[] args) {
		Removeduplicatefromstart removeduplicate = new Removeduplicatefromstart();
		removeduplicate.Returnlist();
	}
}
