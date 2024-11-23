/*Assignment - 10 : 18th Nov'2024

Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.

1 to 3 -> Q1
4 to 6 -> Q2
7 to 9 -> Q3
10 to 12 -> Q4

input : 5
output : Month index 5 is in Q2, its May.

input : 2
output : Month index 2 is in Q1, its Febuary.

input : -3
output: invalid month index, it can't be negative.

input : 13
output: invalid month index, it can't be greater than 13.*/
package pooja;

public class Assignment_10 {

	void quarter(int index) {
		if (index >= 1 && index <= 3) {
			if (index == 1) {
				System.out.println("Month index " + index + " is in Q1, its January");
			} else if (index == 2) {
				System.out.println("Month index " + index + " is in Q1, its February");
			} else
				System.out.println("Month index " + index + " is in Q1, its March");
		} else if (index >= 4 && index <= 6) {
			if (index == 4) {
				System.out.println("Month index " + index + " is in Q2, its April");
			} else if (index == 5) {
				System.out.println("Month index " + index + " is in Q2, its May");
			} else
				System.out.println("Month index " + index + " is in Q2, its June");
		} else if (index >= 7 && index <= 9) {
			if (index == 1) {
				System.out.println("Month index " + index + " is in Q3, its July");
			} else if (index == 2) {
				System.out.println("Month index " + index + " is in Q3, its August");
			} else
				System.out.println("Month index " + index + " is in Q3, its September");
		} else if (index >= 10 && index <= 12) {
			if (index == 10) {
				System.out.println("Month index " + index + " is in Q4, its October");
			} else if (index == 11) {
				System.out.println("Month index " + index + " is in Q4, its November");
			} else
				System.out.println("Month index " + index + " is in Q4, its December");
		} else {
			if (index < 0) {
				System.out.println("invalid month " + index + ", it can't be negative.");
			} else {
				System.out.println("invalid month " + index + ", it can't be greater than 13");
			}
		} // main if else
	}

	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.quarter(5);
		assignment_10.quarter(2);
		assignment_10.quarter(-3);
		assignment_10.quarter(13);
	}
}