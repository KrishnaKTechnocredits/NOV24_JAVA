package pratik;

public class Assignment20 {
	int count = 0;

	int charcount(String str, char ch) {
		for (int num = 0; num <= str.length() - 1; num++) {
			if (str.charAt(num) == ch) {
				count++;

			}

		}
		return count;
	}

	public static void main(String[] args) {
		Assignment20 a = new Assignment20();
		a.charcount("aakanskha", 'a');
		System.out.println("Count of a in aakanskha is " + a.count);
	}

}
