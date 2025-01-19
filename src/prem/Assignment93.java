package prem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment93 {

	public static void main(String[] args) {

		String s = "1234534622123";
		String[] str = s.split("");
		System.out.println(Arrays.toString(str));

		Map<String, Integer> outputMap = new HashMap<>();

		for (String num : str) {
			int count = 0;
			if (outputMap.get(num) == null) {
				count++;
				outputMap.put(num, count);
			} else if (outputMap.get(num) != null) {
				outputMap.get(num);
				outputMap.put(num, outputMap.get(num) + 1);
			}

		}
		System.out.println(outputMap);
	}
}
