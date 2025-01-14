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

output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi]
 */
package imran.CollectionFramework.ArrayList;
import java.util.*;

public class Assignment77_RemoveDuplicateStrinfExceptFirstOccurence {

	void removeElement(List<String> data, String name)
	{
		for(int i=0;i<data.size();i++)
		{ 
			int index = data.indexOf(name);
			int lastIndex = data.lastIndexOf(name);
			if(index!=lastIndex)
			{
				data.remove(lastIndex);
			}
		}
		System.out.println(" The Resulting ArrayList is "+data);
	}
	
	public static void main(String[] args) {
		Assignment77_RemoveDuplicateStrinfExceptFirstOccurence assignment77_RemoveDuplicateStringFirstExceptOccurence_1 = new Assignment77_RemoveDuplicateStrinfExceptFirstOccurence();
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
		System.out.println(" The Given ArrayList is: " + al);
		assignment77_RemoveDuplicateStringFirstExceptOccurence_1.removeElement(al, "Nitesh");
	}
}
