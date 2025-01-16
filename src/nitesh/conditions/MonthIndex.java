/*Please use nested if else for below requirement.
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
package nitesh.conditions;


class MonthIndex{
	int input;
	String month;

	void calculateMonthIndex(int index){
		this.input = index;

		if(input > 1 && input <= 12){
			if(input >1 && input <=3){
				if(input == 1){
					month = "January";
					System.out.println("Month Index is " + input + " is in Q1, its " + month);
				}else if(input ==2){
					month = "febuary";
					System.out.println("Month Index is " + input + " is in Q1, its " + month);
				}else if (input ==3){
					month = "March";
					System.out.println("Month Index is " + input+ " is in Q1, its " + month);
				}
			}
			if(input >3 && input <=6){
				if(input == 4){
					month = "April";
					System.out.println("Month Index is " + input+ " is in Q2, its " + month);
				}else if(input ==5){
					month = "May";
					System.out.println("Month Index is " + input+ " is in Q2, its " + month);
				}else if (input ==6){
					month = "June";
					System.out.println("Month Index is " + input+ " is in Q2, its "+ month);
				}
			}
			if(input >6 && input <=9){
				if(input == 7){
					month = "July";
					System.out.println("Month Index is "+ input+ " is in Q3, its "+ month);
				}else if(input ==8){
					month = "August";
					System.out.println("Month Index is "+ input+ " is in Q3, its "+ month);
				}else if (input ==9){
					month = "September";
					System.out.println("Month Index is "+ input+ " is in Q3, its "+ month);
				}
			}
			if(input >9 && input <=12){
				if(input == 10){
					month = "July";
					System.out.println("Month Index is "+ input+ " is in Q4, its "+ month);
				}else if(input ==11){
					month = "August";
					System.out.println("Month Index is "+ input+ "is in Q4, its "+ month);
				}else if (input ==12){
					month = "September";
					System.out.println("Month Index is "+ input+ "is in Q4, its "+ month);
				}
			}
		} 
		else {
			if(input <0){
				System.out.println("invalid month "+ input + ",it can't be negative.");
			}
			else{
				System.out.println("invalid month "+ input+ ",it can't be greater than 12");
			}
		}
	}
	public static void main(String[] args){
		MonthIndex monthindex = new MonthIndex();
		monthindex.calculateMonthIndex(5);
		monthindex.calculateMonthIndex(2);
		monthindex.calculateMonthIndex(-3);
		monthindex.calculateMonthIndex(13);
	}
}