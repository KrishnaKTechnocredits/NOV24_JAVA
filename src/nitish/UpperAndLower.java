package nitish;

public class UpperAndLower {
	void result1(String input1) {
		int uCount = 0;
		int lCount = 0;
		for (int i = 0; i < input1.length(); i++) {
			char c1 = input1.charAt(i);
			if (Character.isUpperCase(c1)) {
				uCount++;
			} else if (Character.isLowerCase(c1)) {
				lCount++;
			}
		}
		if (uCount > lCount) {
			System.out.println("Uppercase count is greater and is " + uCount);
		} else if (lCount > uCount) {
			System.out.println("Lowercase count is greater and is " + lCount);
		} else {
			System.out.println("both are same");
		}
	}

	public static void main(String[] args) {
		UpperAndLower obj = new UpperAndLower();
		obj.result1("NitIsH MehTa");

	}

}
