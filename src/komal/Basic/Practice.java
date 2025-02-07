package komal.Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

	void getFrequencyOfCharUsingStringArray(char ch, String str) {

		String charcters[] = str.split("");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(charcters));
		int count = 0;
		for (int i = 0; i < list.size(); i++) {

			String charc = list.get(i);

			if (Character.toString(ch).equals(charc)) {
				count++;
			}

		}
		System.out.println(ch + ": " + count);
	}

	void getFrequencyOfCharUsingCharArray(char ch, String str) {

//		char[] arr = str.toCharArray();
//		ArrayList<Character> list = new ArrayList<>(Arrays.asList(arr));
//		int count = 0;
//		for (int i = 0; i < list.size(); i++) {
//
//			String charc = list.get(i);
//
//			if (Character.toString(ch).equals(charc)) {
//				count++;
//			}
//
//		}
//		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sdfsdfdsfdsfssehjkka";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.indexOf(ch) == i) {
				new Practice().getFrequencyOfCharUsingStringArray(ch, str);
				new Practice().getFrequencyOfCharUsingCharArray(ch, str);
			}
		}

	}

}
