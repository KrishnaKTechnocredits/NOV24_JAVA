package swapnil;

import java.util.ArrayList;
import java.util.List;

public class Assignment84 {
	
	List<String> getDuplicateStringList(String[] str){
		
		
		List<String> Duplicatestring = new ArrayList<String>();
		for(int i=0;i<str.length;i++) {
			String word = str[i];
				if(!Duplicatestring.contains(word)) {
					Duplicatestring.add(word);
			}
		}
		return Duplicatestring;
	}
	public static void main(String[] args) {
		String[] str = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		Assignment84 a = new Assignment84();
		System.out.println(a.getDuplicateStringList(str));
	}
}
