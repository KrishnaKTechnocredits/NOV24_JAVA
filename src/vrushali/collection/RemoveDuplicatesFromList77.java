package vrushali.collection;

import java.util.ArrayList;
import java.util.List;

//Assignment - 77 : 11th Jan
//Remove all duplicate occurances of given name from arrayList except first occurance. 
//
//input : 
//ArrayList<String> al = new ArrayList<String>(100);
//		al.add("Anuja");
//		al.add("Fazrana");
//		al.add("Nitesh");
//		al.add("Fazrana");
//		al.add("Krishna");
//		al.add("Nitesh");
//		al.add("Fazrana");
//		al.add("PremLata");
//		al.add("Nitesh");
//		al.add("Nitesh");
//		al.add("Nitesh");
//		al.add("Aashvi");
//
//output : [Anuja, Fazrana, Nitesh, Fazrana, Krishna, Fazrana, PremLata, Aashvi]
//

public class RemoveDuplicatesFromList77 {
	
	void removeDuplicateWordsFromList(List<String> wordList,String name)
	{
		while(wordList.indexOf(name)!=wordList.lastIndexOf(name))
		{
			wordList.remove(wordList.lastIndexOf(name));
		}
		System.out.println(wordList);
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromList77 removeDuplicatesFromList77=new RemoveDuplicatesFromList77();
		String name="Nitesh";
		ArrayList<String> wordList = new ArrayList<String>(100);
		wordList.add("Anuja");
		wordList.add("Fazrana");
		wordList.add("Nitesh");
		wordList.add("Fazrana");
		wordList.add("Krishna");
		wordList.add("Nitesh");
		wordList.add("Fazrana");
		wordList.add("PremLata");
		wordList.add("Nitesh");
		wordList.add("Nitesh");
		wordList.add("Nitesh");
		wordList.add("Aashvi");
		removeDuplicatesFromList77.removeDuplicateWordsFromList(wordList,name);
		
	}

}
