package pankaj;

public class Assignment11 {

	// int num1,num2;

	void compare1(int num1, int num2) {
		for (int i = 0; i < 1; i++) {
			if (num1 < num2) {
				System.out.println(
						"The" + " " + num1 + " " + "is smaller in between" + " " + num1 + " " + "and" + " " + num2);

			} else {
				System.out.println("The" + " " + num1 + "is bigger in between" + num1 + " " + " and " + num2);
			}
		}

	}

	void compare(int num1, int num2) {
		for (int i = 0; i < 1; i++) {
			if (num1 == num2) {
				System.out.println("The numbers are equal");
			} else if (num1 > num2) {
				System.out.println(
						"The" + " " + num1 + " " + "is bigger in between" + " " + num1 + " " + "and" + " " + num2);
			}
		}

	}

	public static void main(String[] args) {
		Assignment11 fl = new Assignment11();
		fl.compare1(10, 17);
		fl.compare(17, 10);

	}

}
