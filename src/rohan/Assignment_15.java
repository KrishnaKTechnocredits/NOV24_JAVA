package rohan;

public class Assignment_15 {
	public static void main(String[] args) {
		Assignment_15 div = new Assignment_15();
		div.division(5, 100);
	}

	void division(int StartRange, int EndRange) {
		System.out.println("First 3 Number divisiable by 5 and 3 betweem " + StartRange + " to " + EndRange);
		int count = 0;

		for (; StartRange <= EndRange; StartRange++) {
			if (StartRange % 4 == 0 && StartRange % 3 == 0) {
				System.out.println(StartRange);
				count++;
				if (count == 3) {
					break;
				}
			}

		}
	}
}
