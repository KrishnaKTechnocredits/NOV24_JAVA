package swapnil;

import java.util.ArrayList;
import java.util.List;

public class Assignment78 {

	void removeDuplicate(List<String> arr) {
		
		for (int i = 0; i<arr.size();i++) {
		
			String name = arr.get(i);

			int lastindex = arr.indexOf(name);
			int index = arr.lastIndexOf(name);

			if (lastindex!=index ) {
				arr.remove(index);
				i--;
			}
			
		}
		System.out.println(arr);
	}
	

	public static void main(String[] args) {
		Assignment78 A = new Assignment78();
		ArrayList<String> arr = new ArrayList<String>(100);
		arr.add("Anuja");
		arr.add("Fazrana");
		arr.add("Nitesh");
		arr.add("Fazrana");
		arr.add("Krishna");
		arr.add("Nitesh");
		arr.add("Fazrana");
		arr.add("PremLata");
		arr.add("Nitesh");
		arr.add("Nitesh");
		arr.add("Nitesh");
		arr.add("Aashvi");
		
		System.out.println(arr);
		A.removeDuplicate(arr);

	}
}
