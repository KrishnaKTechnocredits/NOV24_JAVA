package prem;

import java.util.*;

public class Assignment90 {

	public static void main(String[] args) {
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };

		LinkedHashSet<String> output = new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println(output);

		List<String> outputList = new ArrayList<>(output);
		for (Integer i = 0; i < outputList.size(); i++) {
			String str = outputList.get(i);
			int firstIndex = outputList.indexOf(outputList.get(0));
			int lastIndex = outputList.indexOf(outputList.get(outputList.size() - 1));
			if (i == firstIndex) {
				System.out.println("First index ->" + str);
			} else if (i == lastIndex) {
				System.out.println("Last index ->" + str);
			}
		}
	}
}
