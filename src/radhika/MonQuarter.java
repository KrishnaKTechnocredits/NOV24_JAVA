package radhika;

public class MonQuarter {

    public static void main(String[] args) {
        
        int monthIndex = 5; 

        
        if (monthIndex < 1) {
            System.out.println("Invalid month index, it can't be negative.");
        } else if (monthIndex > 12) {
            System.out.println("Invalid month index, it can't be greater than 12.");
        } else {
            
            String quarter;
            String monthName;

            if (monthIndex <= 3) {
                quarter = "Q1";
                if (monthIndex == 1) {
                    monthName = "January";
                } else if (monthIndex == 2) {
                    monthName = "February";
                } else {
                    monthName = "March";
                }
            } else if (monthIndex <= 6) {
                quarter = "Q2";
                if (monthIndex == 4) {
                    monthName = "April";
                } else if (monthIndex == 5) {
                    monthName = "May";
                } else {
                    monthName = "June";
                }
            } else if (monthIndex <= 9) {
                quarter = "Q3";
                if (monthIndex == 7) {
                    monthName = "July";
                } else if (monthIndex == 8) {
                    monthName = "August";
                } else {
                    monthName = "September";
                }
            } else {
                quarter = "Q4";
                if (monthIndex == 10) {
                    monthName = "October";
                } else if (monthIndex == 11) {
                    monthName = "November";
                } else {
                    monthName = "December";
                }
            }

           
            System.out.println("Month index " + monthIndex + " is in " + quarter + ", its " + monthName + ".");
        }
    }
}
