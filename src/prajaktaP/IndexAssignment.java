package prajaktaP;
public class IndexAssignment {
	public static void main(String[] args) {
        monthInfo(5);   
        monthInfo(2);   
        monthInfo(-3);  
        monthInfo(13); 
    }
 public static void monthInfo(int monthIndex) {
        if (monthIndex < 1 || monthIndex > 12) {
            if (monthIndex < 1) {
                System.out.println("Invalid Month Index, It cannot be Negative.");
            } else {
                System.out.println("Invalid Month Index, It cannot be greater than 13.");
            }
        } else {
            String quarter = "";
            String monthName = "";

            if (monthIndex >= 1 && monthIndex <= 3) {
                quarter = "Q1";
                if (monthIndex == 1) {
                    monthName = "January";
                } else if (monthIndex == 2) {
                    monthName = "February";
                } else {
                    monthName = "March";
                }
            } else {
                if (monthIndex >= 4 && monthIndex <= 6) {
                    quarter = "Q2";
                    if (monthIndex == 4) {
                        monthName = "April";
                    } else if (monthIndex == 5) {
                        monthName = "May";
                    } else {
                        monthName = "June";
                    }
                } else {
                    if (monthIndex >= 7 && monthIndex <= 9) {
                        quarter = "Q3";
                        if (monthIndex == 7) {
                            monthName = "July";
                        } else if (monthIndex == 8) {
                            monthName = "August";
                        } else {
                            monthName = "September";
                        }
                    } else {
                        if (monthIndex >= 10 && monthIndex <= 12) {
                            quarter = "Q4";
                            if (monthIndex == 10) {
                                monthName = "October";
                            } else if (monthIndex == 11) {
                                monthName = "November";
                            } else {
                                monthName = "December";
                            }
                        }
                    }
                }
            }

            System.out.println("Month index " + monthIndex + " is in " + quarter + ", its " + monthName + ".");
        }
    }
}
