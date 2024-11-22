/*
 * Assignment - 10 : 18th Nov'2024

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
output: invalid month index, it can't be greater than 13.
 */
package amruta;

public class Assignment_10 {

	void printQuarter(int monthNum) {
		if (monthNum > 0) {
			if (monthNum >= 1 && monthNum <= 3) {
				if (monthNum == 1) {
					System.out.println("Month number " + monthNum + " is in Q1 & it's Janauary.");
				} else if (monthNum == 2) {
					System.out.println("Month number " + monthNum + " is in Q1 & it's February.");
				} else if (monthNum == 3) {
					System.out.println("Month number " + monthNum + " is in Q1 & it's March.");
				}
			} else if (monthNum >= 4 && monthNum <= 6) {
				if (monthNum == 4) {
					System.out.println("Month number " + monthNum + " is in Q2 & it's April.");
				} else if (monthNum == 5) {
					System.out.println("Month number " + monthNum + " is in Q2 & it's May.");
				} else if (monthNum == 6) {
					System.out.println("Month number " + monthNum + " is in Q2 & it's June.");
				}
			} else if (monthNum >= 7 && monthNum <= 9) {
				if (monthNum == 7) {
					System.out.println("Month number " + monthNum + " is in Q3 & it's July.");
				} else if (monthNum == 8) {
					System.out.println("Month number " + monthNum + " is in Q3 & it's August.");
				} else if (monthNum == 9) {
					System.out.println("Month number " + monthNum + " is in Q3 & it's September.");
				}
			} else if (monthNum >= 10 && monthNum <= 12) {
				if (monthNum == 10) {
					System.out.println("Month number " + monthNum + " is in Q4 & it's October.");
				} else if (monthNum == 11) {
					System.out.println("Month number " + monthNum + " is in Q4 & it's November.");
				} else if (monthNum == 12) {
					System.out.println("Month number " + monthNum + " is in Q4 & it's December.");
				}
			} else {
				System.out.println("invalid month monthNum, it can't be greater than 12.");
			}
		} else {
			System.out.println("invalid month monthNum, it can't be negative.");
		}
	}

	public static void main(String[] args) {

		Assignment_10 a10 = new Assignment_10();
		a10.printQuarter(5);
		a10.printQuarter(2);
		a10.printQuarter(-3);
		a10.printQuarter(13);
	}
}
