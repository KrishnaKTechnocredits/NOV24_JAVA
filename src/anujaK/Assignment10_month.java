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
output: invalid month index, it can't be greater than 13.

*/
package anujaK;

public class Assignment10_month {
	public void displayMonthInfo(int month) {
		//first else if block with nested  if else for Q1 and its individual months.
		
		if(month>=1 && month <=3) {
			if (month==1) {
				System.out.println("Month index is "+month+" in Q1 , its Jan month");
				System.out.println("------------------------ \n");
			}
			else if (month==2) {
				System.out.println("Month index is "+month+" in Q1 , its Feb month");
				System.out.println("------------------------ \n");

				}
			else if (month==3) {
				System.out.println("Month index is "+month+" in Q1 , its March month");
				System.out.println("------------------------ \n");
				}
			}
		
		else if (month>=4 && month <=6){
			//second else if block for Q2 and its individual months.
			if (month==4) {
				System.out.println("Month index is "+month+" in Q2 , its Apr month");
				System.out.println("------------------------ \n");
			}
			else if (month==5) {
				System.out.println("Month index is "+month+" in Q2 , its May month");
				System.out.println("------------------------ \n");
				}
			else if (month==6) {
				System.out.println("Month index is "+month+" in Q2 , its June month");
				System.out.println("------------------------ \n");
				}
			}
		
		else if (month>=7 && month <=9){
			//Third else if block for Q2 and its individual months.
			if (month==7) {
				System.out.println("Month index is "+month+" in Q3 , its July month");
				System.out.println("------------------------ \n");
			}
			else if (month==8) {
				System.out.println("Month index is "+month+" in Q3 , its Aug month");
				System.out.println("------------------------ \n");
				}
			else if (month==9) {
				System.out.println("Month index is "+month+" in Q3 , its Sept month");
				System.out.println("------------------------ \n");
				}
			}
		
		else if (month>=10 && month <=12){
			//Last else if block for Q4 and its individual months.
			if (month==10) {
				System.out.println("Month index is "+month+" in Q4 , its Oct month");
				System.out.println("------------------------ \n");
			}
			else if (month==11) {
				System.out.println("Month index is "+month+" in Q4 , its Nov month");
				System.out.println("------------------------ \n");
				}
			else if (month==12) {
				System.out.println("Month index is "+month+" in Q4 , its Dec month");
				System.out.println("------------------------ \n");
				}
			}
		else if(month<0){
			System.out.println("invalid month index, it can't be negative");//check if negative num given
			System.out.println("------------------------ \n");
		}
		
		else if(month>12){
			System.out.println("invalid month index, it can't be greater than 12");//check invalid month num
			System.out.println("------------------------ \n");
		}
		}
			
	public static void main(String [] args) {
		Assignment10_month assignment10_month = new Assignment10_month();//object of class Assignment10_month
		assignment10_month.displayMonthInfo(5);
		assignment10_month.displayMonthInfo(2);
		assignment10_month.displayMonthInfo(-3);
		assignment10_month.displayMonthInfo(13);	
	}//main method calling display method	
}
		
		