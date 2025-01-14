package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.List;

public class Assignment_78 {
	
	List<String> getListOfUniqueString(List<String> input){
		for (int index=0;index<input.size();index++) {
			String str=input.get(index);
			int currentIndex=input.indexOf(str);
			int lastIndex=input.lastIndexOf(str);
			if (currentIndex!=lastIndex || index>currentIndex) {
				input.remove(currentIndex);
				input.remove(index);
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		Assignment_78 assignmengt_78=new Assignment_78();
		List<String> input = new ArrayList<String>();
		input.add("Anuja");
		input.add("Fazrana");
		input.add("Nitesh");
		input.add("Fazrana");
		input.add("Krishna");
		input.add("Nitesh");
		input.add("Fazrana");
		input.add("PremLata");
		input.add("Nitesh");
		input.add("Nitesh");
		input.add("Nitesh");
		input.add("Aashvi");
		List<String> output=assignmengt_78.getListOfUniqueString(input);
		System.out.println(output);
	}

}
