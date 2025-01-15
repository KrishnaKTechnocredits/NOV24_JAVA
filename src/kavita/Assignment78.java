package kavita;

import java.util.ArrayList;
import java.util.List;

/*Assignment - 78 : 11th Jan
Remove all duplicate occurances of given name from arrayList except last occurance. 
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

output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi]
Time:9m*/
public class Assignment78 {
	List<String> removeAllDuplicatesExceptLastOccurance (String name,List<String> arrayList){
		for(int i=0;i<arrayList.size();i++){
			String name1=arrayList.get(i);
			if(name1==name){
				if(arrayList.lastIndexOf(name)!=arrayList.indexOf(name)){
					arrayList.remove(arrayList.indexOf(name));
				}
			}
		}return arrayList;
	}
	
	public static void main(String[] args) {
		Assignment78 assignment78 = new Assignment78();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Anuja");
		arrayList.add("Fazrana");
		arrayList.add("Nitesh");
		arrayList.add("Fazrana");
		arrayList.add("Krishna");
		arrayList.add("Nitesh");
		arrayList.add("Fazrana");
		arrayList.add("PremLata");
		arrayList.add("Nitesh");
		arrayList.add("Nitesh");
		arrayList.add("Nitesh");
		arrayList.add("Aashvi");
		System.out.println("Input: " + arrayList);
		System.out.println("Output: " + assignment78.removeAllDuplicatesExceptLastOccurance("Nitesh", arrayList));
	}
}
