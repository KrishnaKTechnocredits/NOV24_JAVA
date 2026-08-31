package prem;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment86 {

	public static void main(String[] args) {
		String[] input = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		ArrayList<String> originalList = new ArrayList<String>(Arrays.asList(input));

		for (int i=0;i <originalList.size();i++) {
			String name =originalList.get(i);
			if (name.length() <= 5) {
				originalList.remove(name);
			}

		}
		System.out.println(originalList);
	}

}
