/* Please use nested if else for below requirement.
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
output: invalid month index, it can't be greater than 13. */

package nikita.ifelsedemo;

public class Assignment10 {
	
	void printQuarterAndMonth(int index) {
		if(index < 1) {
			System.out.println("Invalid month index, it can't be less than 1.");
		}else if (index >= 1 && index <= 3) {
			if(index==1) {
				System.out.println("Month index 1 is in Q1, its January.");
			}else if(index == 2) {
				System.out.println("Month index 2 is in Q1, its February.");
			}else if(index == 3) {
				System.out.println("Month index 3 is in Q1, its March.");
			}		
		}else if (index >= 4 && index <= 6) {
			if(index == 4) {
				System.out.println("Month index 4 is in Q2, its April.");
			}else if(index == 5) {
				System.out.println("Month index 5 is in Q2, its May.");
			}else if(index == 6) {
				System.out.println("Month index 6 is in Q2, its June.");
			}
		}else if (index >= 7 && index <= 9) {
			if(index == 7) {
				System.out.println("Month index 7 is in Q3, its July.");
			}else if(index == 8) {
				System.out.println("Month index 8 is in Q3, its August.");
			}else if(index == 9) {
				System.out.println("Month index 9 is in Q3, its September.");
			}
		}else if (index >= 10 && index <= 12) {
			if(index == 10) {
				System.out.println("Month index 10 is in Q4, its October.");
			}else if(index == 11) {
				System.out.println("Month index 11 is in Q4, its November.");
			}else if(index == 12) {
				System.out.println("Month index 12 is in Q4, its December.");
			}
		}else {
			System.out.println("invalid month index, it can't be 13.");
		}
		
	}

	public static void main(String[] args) {
		Assignment10 a10 = new Assignment10();
		a10.printQuarterAndMonth(5);
		a10.printQuarterAndMonth(2);
		a10.printQuarterAndMonth(-3);
		a10.printQuarterAndMonth(13);
	}
}
