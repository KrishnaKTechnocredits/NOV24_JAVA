package kishor;
//Print frequency of each word from given String.
//String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

public class Assignment69_ArrayString {

	void displayFrequencyOfString(String str) {
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (!word.equals("")) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j])) {
						arr[j] = "";
						count++;
					}
				}
				System.out.println(word + "->" + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment69_ArrayString assignment69 = new Assignment69_ArrayString();
		assignment69.displayFrequencyOfString("Hi Hello Hi Hi Hi Techno Credits Techno");
	}
}
