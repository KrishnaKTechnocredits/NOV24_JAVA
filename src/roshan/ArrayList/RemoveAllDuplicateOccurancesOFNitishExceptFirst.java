package roshan.ArrayList;
import java.util.*;
public class RemoveAllDuplicateOccurancesOFNitishExceptFirst {
	static List <String> getNitishWithotDublicate(List <String> ListOfNames,String name){
/*		List <String> withoutDublicate = new ArrayList <String>();   not require as it make changes in current list
*/		while(ListOfNames.indexOf(name)!= ListOfNames.lastIndexOf(name)){
			ListOfNames.remove(ListOfNames.lastIndexOf(name));   //this keep firt occurance and remove the other occurance
	        
			}
return ListOfNames ;			
			
	}

		public static void main(String [] args) {
			List<String> al= new ArrayList <String>();
			al.add("anuja");
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
			
			String NameToRemove =  "Nitesh";     //if removing any thing add like this
			 List <String> output = RemoveAllDuplicateOccurancesOFNitishExceptFirst.getNitishWithotDublicate(al,NameToRemove);
			System.out.println(output);
			
			
}
	
}


/*Assignment - 77 : 11th Jan
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

output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi]*/

