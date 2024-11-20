
/*
Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.

1 to 3 -> Q1
4 to 6 -> Q2
7 to 9 -> Q3
10 to 12 -> Q4

*/
package ajay;

public class Assignment10 {
	String quarter;
	String monthName;
	
	void printquarterMonth(int index){
		if (index >= 1 && index <= 3) {
            if (index == 1) {
                monthName = "January";
            } else if (index == 2) {
                monthName = "February";
            } else {
                monthName = "March";
            }
            quarter = "Q1";
            System.out.println("For Month Index "+index +" MonthName is "+monthName +" and"+" Quarter is "+quarter);
        	} else if (index >= 4 && index <= 6) {
            if (index == 4) {
                monthName = "April";
            } else if (index == 5) {
                monthName = "May";
            } else {
                monthName = "June";
            }
            quarter = "Q2";
            System.out.println("For Month Index "+index +" MonthName is "+monthName +" and"+" Quarter is "+quarter);
        } else if (index >= 7 && index <= 9) {
            if (index == 7) {
                monthName = "July";
            } else if (index == 8) {
                monthName = "August";
            } else {
                monthName = "September";
            }
            quarter = "Q3";
            System.out.println("For Month Index "+index +" MonthName is "+monthName +" and"+" Quarter is "+quarter);
        } else if (index >= 10 && index <= 12) {
            if (index == 10) {
                monthName = "October";
            } else if (index == 11) {
                monthName = "November";
            } else {
                monthName = "December";
            }
            quarter = "Q4";
            System.out.println("For Month Index "+index +" MonthName is "+monthName +" and"+" Quarter is "+quarter);
        } else {
            System.out.println("Invalid month index! Please enter a value between 1 and 12.");
        }
	}	

	public static void main(String[] args){
		Assignment10 assignment10=new Assignment10();
		assignment10.printquarterMonth(5);
	}

}
