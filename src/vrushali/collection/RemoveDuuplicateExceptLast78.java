package vrushali.collection;

import java.util.ArrayList;
import java.util.List;

//Assignment - 78 : 11th Jan
//Remove all duplicate occurances of given name from arrayList except last occurance. 
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
//output : [Anuja, Fazrana, Fazrana, Krishna, Fazrana, PremLata, Nitesh, Aashvi]

public class RemoveDuuplicateExceptLast78 {
	
	void removeDuplicateWordsFromList(List<String> wordList,String name)
	{
		while(wordList.indexOf(name)!=wordList.lastIndexOf(name))
		{
			wordList.remove(name);
		}
		System.out.println(wordList);
	}
	
	public static void main(String[] args) {
		RemoveDuuplicateExceptLast78 removeDuuplicateExceptLast78=new RemoveDuuplicateExceptLast78();
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
		removeDuuplicateExceptLast78.removeDuplicateWordsFromList(wordList,name);
		
	}

}
