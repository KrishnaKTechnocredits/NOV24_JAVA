package kavita.basic;

/*Assignment-10: Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.*/

public class Month {
	
	void printQuarterandMonthIndex(int index) {
			if(index<1) {
				System.out.println("Invalid month index, it can't be negative");
			}else if(index>=1 && index<=3) {
				if(index==1) {
					System.out.println("Month index " + index + " is in Q1. Its January");
				}else if(index==2){
					System.out.println("Month index " + index + " is in Q1. Its February");
					}
				else {
					System.out.println("Month index " + index + " is in Q1. Its March");
				}
			}else if(index>=4 &&index<=6) {
				if(index==4) {
					System.out.println("Month index " + index + " is in Q2. Its April");
				}else if(index==5){
					System.out.println("Month index " + index + " is in Q2. Its May");
					}
				else {
					System.out.println("Month index " + index + " is in Q2. Its June");
				}
			}else if(index>=7 &&index<=9) {
				if(index==7) {
					System.out.println("Month index " + index + " is in Q3. Its July");
				}else if(index==8){
					System.out.println("Month index " + index + " is in Q3. Its August");
					}
				else {
					System.out.println("Month index " + index + " is in Q3. Its September");
				}
			}else if(index>=10 &&index<=12) {
				if(index==10) {
					System.out.println("Month index " + index + " is in Q4. Its October");
				}else if(index==11){
					System.out.println("Month index " + index + " is in Q4. Its November");
					}
				else {
					System.out.println("Month index " + index + " is in Q4. Its December");
				}
			}else {
				System.out.println("Invalid month index, it can't be greater than 12.");	
				}
	}
	
	public static void main(String[] args) {
		Month month=new Month();
		month.printQuarterandMonthIndex(5);
		month.printQuarterandMonthIndex(2);
		month.printQuarterandMonthIndex(-3);
		month.printQuarterandMonthIndex(13);
	}
}
