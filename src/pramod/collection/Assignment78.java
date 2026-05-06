/*
Assignment - 78 : 11th Jan
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

output : [Anuja, Krishna, Fazrana, PremLata, Nitesh, Aashvi]
*/

package pramod.collection;
import java.util.*;
class Assignment78{
	
	void removeAllOccurenceExcepLastOne(String[] str) throws Exception {
		List<String> orignalList = Arrays.asList(str);
		List<String> resultList = new ArrayList<String>();
		for(int i=0; i<str.length; i++){
			if(orignalList.lastIndexOf(str[i])==i){
			
			resultList.add(str[i]);
			
		}
	}
	System.out.println(resultList);
	}
	
	public static void main(String[] args){
		String[] str = {"Anuja", "Fazrana", "Nitesh", "Fazrana", "Krishna", "Nitesh", "Fazrana", "PremLata", "Nitesh","Nitesh","Nitesh","Aashvi"};
		try{
			new Assignment78().removeAllOccurenceExcepLastOne(str);
		}catch(Exception e){
			System.out.println("Error Occured: "+ e.getMessage());
		}
	}
}