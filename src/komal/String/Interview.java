//str = "aabbcc"  output a:2 b:2 c:2
package komal.String;

public class Interview {
	static void getFreuency(char ch, String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char currentch = str.charAt(i);
			if (ch == currentch) {
				count++;
			}
		}
		System.out.println("count for character " + ch + " is " + count);

	}

	public static void main(String[] args) {

		String str = "aabbbcccc";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (str.indexOf(ch) == i) {
				getFreuency(ch, str);
			}
		}

	}

}
