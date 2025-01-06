package swapnil;

public class Assignment71 {

	void printWordWithDigit(String line) {
		String maxString = "";
		int maxCount = 0;
		String[] arr = line.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = getDigitCount(arr[i]);
			if (maxCount < count) {
				maxCount = count;
				maxString = arr[i];
			}
		}
		System.out.println(maxString + "->" + maxCount);
	}

	int getDigitCount(String arr) {
		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isDigit(ch)) {

				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		Assignment71 a = new Assignment71();
		a.printWordWithDigit(str);

	}

}
