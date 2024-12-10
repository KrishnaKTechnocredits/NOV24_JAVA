package prem;

public class Assignment33 {

	void freqUpperCase(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			int count = 0;
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (index == i) {
				for (int j = 0; j < str.length(); j++) {
					if (Character.isUpperCase(ch)) {
						if (ch == str.charAt(j)) {
							count++;
						}
					}
				}
				if (Character.isUpperCase(ch)) {
					System.out.println(ch + "-> " + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment33 assign33 = new Assignment33();
		assign33.freqUpperCase("AABcBBBAdeddd");
	}

}
