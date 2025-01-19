package swapnil;

import java.util.ArrayList;

public class Assignment77 {

	void removeDuplicate(ArrayList<String> arr) {
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) {
			String name = arr.get(i);

			int index = arr.indexOf(name);
			int lastindex = arr.lastIndexOf(name);

			if (index != lastindex ) {
				arr.remove(lastindex);
				i--;
			}
					}
		
		System.out.println(arr);

	}

	public static void main(String[] args) {
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
		Assignment77 A = new Assignment77();
		A.removeDuplicate(arr);

	}
}
