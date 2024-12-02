package prem;

public class Assignment25 {
	int sum;

	void sumDigit(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum = sum + digit;
				if (i == str.length() - 1) {
					break;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment25 assign = new Assignment25();
		assign.sumDigit("te1ch2no3cre7dits");
		
		Assignment25 assign1 = new Assignment25();
		assign1.sumDigit("techno");
		
		Assignment25 assign2 = new Assignment25();
		assign2.sumDigit("4563");

	}
}
