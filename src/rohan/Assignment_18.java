package rohan;

public class Assignment_18 {
	public static void main(String[] args) {
		Assignment_18 div = new Assignment_18();
		div.division(1, 498);
	}

	void division(int StartRange, int EndRange) {
		int count = 0;

		for (; EndRange >= StartRange; EndRange--) {
			if (EndRange % 5 == 0) {
				System.out.println(EndRange + " is a last number divisiable by 5");
				count++;
				if (count == 1)
					break;
			}
		}

	}
}
