/*Assignment - 10 : 18th Nov'2024 [15 min]

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
package pramod;

class Assignment10 {
	
	void printMonthQuater(int quaterno) {
		if(quaterno >= 1 && quaterno <= 3){
			if(quaterno == 1) {
				System.out.println("Month index " + quaterno + " is in Q1, its January");
			}
			if(quaterno == 2) {
				System.out.println("Month index " + quaterno + " is in Q1, its February");
			}
			if(quaterno == 3) {
			System.out.println("Month index " + quaterno + " is in Q1, its March");
			}
		}
		else if(quaterno >= 4 && quaterno <= 6){
			if(quaterno == 4) {
				System.out.println("Month index " + quaterno + " is in Q2, its April");
			}
			if(quaterno == 5) {
				System.out.println("Month index " + quaterno + " is in Q2, its May");
			}
			if(quaterno == 6) {
			System.out.println("Month index " + quaterno + " is in Q2, its June");
			}
		}
		else if(quaterno >= 7 && quaterno <= 9){
			if(quaterno == 7) {
				System.out.println("Month index " + quaterno + " is in Q3, its July");
			}
			if(quaterno == 8) {
				System.out.println("Month index " + quaterno + " is in Q3, its August");
			}
			if(quaterno == 9) {
			System.out.println("Month index " + quaterno + " is in Q3, its September");
			}
		}
		else if(quaterno >= 10 && quaterno <= 12){
			if(quaterno == 10) {
				System.out.println("Month index " + quaterno + " is in Q4, its Octomber");
			}
			if(quaterno == 11) {
				System.out.println("Month index " + quaterno + " is in Q4, its November");
			}
			if(quaterno == 12) {
			System.out.println("Month index " + quaterno + " is in Q4, its December");
			}
		}
		else if(quaterno == 0) {
			System.out.println("Invalid month index, it can't be zero");
		}
		else if(quaterno < 0) {
			System.out.println("Invalid month index, it can't be negative");
		}	
		else {
			System.out.println("Invalid month index, it can't be greater than 13");
		}
	}
	public static void main(String[] args){
		Assignment10 month = new Assignment10();
		month.printMonthQuater(5);
		month.printMonthQuater(2);
		month.printMonthQuater(-3);
		month.printMonthQuater(13);
	}		
}