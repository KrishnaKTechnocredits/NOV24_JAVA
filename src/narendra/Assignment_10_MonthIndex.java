package narendra;
/*
Assignment - 10 : 18th Nov'2024

Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.

1 to 3 -> Q1
4 to 6 -> Q2
7 to 9 -> Q3
10 to 12 -> Q4

input : 5
output : Month index 5 is in Q2, its May.

input : 2
output : Month index 2 is in Q1, its February.

input : -3
output: invalid month index, it can't be negative.

input : 13
output: invalid month index, it can't be greater than 12.
*/

public class Assignment_10_MonthIndex {
	
	void toPrintMonthIndex(int monthinput) {
		
		if(monthinput >=1 && monthinput <=3) { //Q1
			if (monthinput==1) {
				System.out.println("output : Month index 1 is in Q1, its January");
			}
			else if(monthinput==2) {
				System.out.println("output : Month index 2 is in Q1, its Febuary");
			}
			else {
				System.out.println("output : Month index 3 is in Q1, its March");
			}		
		}
		
		else if(monthinput >=4 && monthinput <=6) { //Q2
		    if (monthinput==4) {
				System.out.println("output : Month index 4 is in Q1, its April");
			}
			else if(monthinput==5) {
				System.out.println("output : Month index 5 is in Q1, its May");
			}
			else {
				System.out.println("output : Month index 6 is in Q1, its June");
			}	
		}
		
		else if(monthinput >=7 && monthinput <=9) { //Q3
			if (monthinput==7) {
				System.out.println("output : Month index 7 is in Q1, its July");
			}
			else if(monthinput==8) {
				System.out.println("output : Month index 8 is in Q1, its August");
			}
			else {
				System.out.println("output : Month index 9 is in Q1, its September");
			}	
		}
		
		else if(monthinput >=10 && monthinput <=12) { //Q4
			if (monthinput==10) {
				System.out.println("output : Month index 10 is in Q1, its October");
			}
			else if(monthinput==11) {
				System.out.println("output : Month index 11 is in Q1, its November");
			}
			else {
				System.out.println("output : Month index 12 is in Q1, its December");
			}	
		}
		
		else if(monthinput >12) { //Invalid month
			System.out.println("output : invalid month index, it can't be greater than 12");
			
		}
		
		else if(monthinput <=0) {
			if (monthinput==0) {
				System.out.println("output : invalid month index, it can't be 0.");
			}
			else{
				System.out.println("output : invalid month index, it can't be negative.");
			}		
		}
	}

	public static void main(String[] args) {
		Assignment_10_MonthIndex monthindex = new Assignment_10_MonthIndex();
		monthindex.toPrintMonthIndex(5);
		monthindex.toPrintMonthIndex(2);
		monthindex.toPrintMonthIndex(-3);
		monthindex.toPrintMonthIndex(13);
		monthindex.toPrintMonthIndex(0);

	}

}