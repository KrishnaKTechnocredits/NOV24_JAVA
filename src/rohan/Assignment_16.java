package rohan;

public class Assignment_16 {
	public static void main(String[] args) {
		Assignment_16 div = new Assignment_16();
		div.division(1, 210);
	}

	void division(int StartRange, int EndRange) {
		System.out.println("Number are :");
		int count = 0;
		int sum = 0;
		for (; StartRange <= EndRange; StartRange++) {
			if (StartRange % 5 == 0 && StartRange % 7 == 0) {
				System.out.println(StartRange);
				sum = sum + StartRange;
				count++;
				if (count == 3) {
					break;
				}
			}
		}
		System.out.println("Sum is : " + sum);
		int Avg = sum / count;
		System.out.println("Avg is : " + Avg);
	}
}
