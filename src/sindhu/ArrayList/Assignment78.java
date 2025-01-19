/*Remove all duplicate occurances of given name from arrayList except last occurance. 

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

output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi]*/

package sindhu.ArrayList;

import java.util.ArrayList;

public class Assignment78 {
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
		
ArrayList<String> outAl = new ArrayList<String>();
		
		for(int i=0; i<al.size(); i++) {
			String str = al.get(i); 
			if(al.indexOf(str)!= al.lastIndexOf(str)) {
				al.remove(al.indexOf(str));
				i--;
			}
		}
		System.out.println(al);
	}
}
