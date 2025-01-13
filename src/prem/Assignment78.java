package prem;

import java.util.ArrayList;

public class Assignment78 {
	
	public static void main(String[] args) {
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

		ArrayList<String> output = name;
		for (int i = 0; i < name.size(); i++) {
			String str = name.get(i);
			int index = name.indexOf(str);
			int lastIndex = name.lastIndexOf(str);
			while (lastIndex != index) {
				output.remove(str);
				lastIndex = name.lastIndexOf(str);
				index = name.indexOf(str);
			}
		}
		System.out.print(output);
	}
}
