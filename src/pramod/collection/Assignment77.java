/*
Assignment - 77 : 11th Jan
Remove all duplicate occurances of given name from arrayList except first occurance. 

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

output : [Anuja, Fazrana, Nitesh, Krishna, PremLata, Aashvi]
*/

package pramod.collection;
import java.util.*;
class Assignment77{
	
	void removeAllDuplicateOccurence(String[] str){
		List<String> orignalList = Arrays.asList(str);
		List<String> myList = new ArrayList<String>();
		try{
			for(int i=0; i<str.length; i++){
					if(orignalList.indexOf(str[i])==orignalList.lastIndexOf(str[i])|| orignalList.indexOf(str[i])==i){
						myList.add(str[i]);
					}
			}
		}catch(Exception e){
				System.out.println(e.getMessage());
		}
		System.out.println("All duplicate occurances are removed : "+ myList);
	}

	public static void main(String[] args){
		String[] str= {"Anuja", "Fazrana", "Nitesh", "Fazrana", "Krishna", "Nitesh", "Fazrana", "PremLata", "Nitesh", "Nitesh" , "Nitesh", "Aashvi"};
		new Assignment77().removeAllDuplicateOccurence(str);
	}
}