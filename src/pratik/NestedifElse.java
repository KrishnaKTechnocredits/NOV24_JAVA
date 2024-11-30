package pratik;

public class NestedifElse {
	void printQtrMonth(int index) {
		if (index >= 1 && index <= 3) {
			if (index == 1) {
				System.out.println("Month index is " + index + " is in Q1, January");
			} else if (index == 2) {
				System.out.println("Month index is " + index + " is in Q1, February");
			} else if (index == 3) {
				System.out.println("Month index is " + index + " is in Q1, March");
			}

		} else if (index >= 4 && index <= 6) {
			if (index == 4) {
				System.out.println("Month index is " + index + " is in Q2, April");
			} else if (index == 5) {
				System.out.println("Month index is " + index + " is in Q2, May");
			} else if (index == 6) {
				System.out.println("Month index is " + index + " is in Q2, June");
			}
		} else if (index >= 7 && index <= 9) {
			if (index == 7) {
				System.out.println("Month index is " + index + " is in Q3, July");
			} else if (index == 8) {
				System.out.println("Month index is " + index + " is in Q3, August");
			} else if (index == 9) {
				System.out.println("Month index is " + index + " is in Q3, September");
			}
		} else if (index >= 10 && index <= 12) {
			if (index == 10) {
				System.out.println("Month index is " + index + " is in Q4, October");
			} else if (index == 11) {
				System.out.println("Month index is " + index + " is in Q4, November");
			} else if (index == 12) {
				System.out.println("Month index is " + index + " is in Q4, December");
			}
		} else if (index < 0) {
			System.out.println("Invalid month index,it cant be negative");
		} else {
			System.out.println("Invalid month index, it cant be greater than 12");
		}
	}

	public static void main(String[] args) {
		NestedifElse nestedifelse = new NestedifElse();
		nestedifelse.printQtrMonth(5);
		nestedifelse.printQtrMonth(2);
		nestedifelse.printQtrMonth(-3);
		nestedifelse.printQtrMonth(13);
	}

}
