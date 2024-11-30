package rohan;

public class Assignment_17 {
	public static void main(String[] args) {
		Assignment_17 div = new Assignment_17();
		div.division(1, 210);
	}

	void division(int StartRange, int EndRange) {
		System.out.println("Last 5 Number divisiable by 5 and 3 betweem " + StartRange + " to " + EndRange);
		int count = 0;

		for (; EndRange >= StartRange; EndRange--) {
			if (EndRange % 5 == 0 && EndRange % 7 == 0) {
				System.out.println(EndRange);
				count++;
				if (count == 5) {
					break;
				}
			}

		}
	}
}
