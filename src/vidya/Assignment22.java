package vidya;

public class Assignment22 {

	int dcount = 0;

	void countdigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				dcount++;
			}
		}
		System.out.println("total " + dcount + " digits are there in given input.");
	}

	public static void main(String[] args) {
		Assignment22 ass22 = new Assignment22();
		ass22.countdigit("aa1kan33ks4h5a");
	}

}
