package ravindra;

import java.util.HashMap;
import java.util.Map;

public class Assignment_93 {
	public static void main(String[] args) {
		String str = "Ravindra";
		Map<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (m.containsKey(ch)) {
				Integer num = m.get(ch);
				m.put(ch, num + 1);

			} else {
				m.put(ch, 1);
			}
		}
		System.out.println(m);
	}
}
