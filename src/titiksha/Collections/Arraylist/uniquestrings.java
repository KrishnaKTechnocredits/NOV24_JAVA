//find unique string from list
package titiksha.Collections.Arraylist;

import java.util.ArrayList;

public class uniquestrings {
	void finduniquestring() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Anuja");
		name.add("Fazrana");
		name.add("Nitesh");
		name.add("Fazrana");
		name.add("Krishna");
		name.add("Nitesh");
		name.add("Fazrana");
		name.add("PremLata");
		name.add("Nitesh");
		name.add("Nitesh");
		name.add("Nitesh");
		name.add("Aashvi");

		for(int i=0;i<name.size();i++) {
			String duplicate=name.get(i);//getting value from index i
			int indexof=name.indexOf(duplicate);//getting first index of list
			int lastIndexof=name.lastIndexOf(duplicate);//getting last index of list
			if(indexof==lastIndexof) {//if first index and last last index match the  it is duplicate string
			System.out.println(duplicate);//to find unique Strings from list
			}
		}
	}
	
	public static void main(String[] args) {
		uniquestrings  removeduplicate=new uniquestrings();
		removeduplicate.finduniquestring();
		}
	}

