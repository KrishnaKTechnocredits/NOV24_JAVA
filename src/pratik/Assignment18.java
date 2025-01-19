package pratik;

public class Assignment18 {
	int startRange, endRange;
	static int num;

	int lastnum(int startRange, int endRange) {
		for (num = endRange; num >= startRange; num--) {
			if (num % 5 == 0) {
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Assignment18 a = new Assignment18();
		a.lastnum(10, 498);
		System.out.println(num + " is the last number which is div by 5 in the given range.");

	}
}
