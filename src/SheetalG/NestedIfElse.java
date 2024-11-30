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
output: invalid month index, it can't be greater than 13.*/
package SheetalG;
public class NestedIfElse {
	String quarter;
	String monthName;

	void getMonthQuaterName(int index) {
		if(index >= 1 && index <= 3){
			if(index == 1){
				System.out.println("Month index "+ index+" is in Q1, its January");
			}else if(index ==2){
				System.out.println("Month index "+ index+" is in Q1, its February");
			}else if(index == 3){
				System.out.println("Month index "+ index+" is in Q1, its March");
			}
		}
		if(index >= 4 && index <= 6){
			if(index == 4){
				System.out.println("Month index " + index+ " is in Q2, its April");
			}else if(index == 5){
				System.out.println("Month index " + index+ " is in Q2, its May");
			}else if(index == 6){
				System.out.println("Month index "+ index+" is in Q2, its June");
			}
		}
		if(index >= 7 && index <= 9){
			if(index ==7){
				System.out.println("Month index "+ index+" is in Q3, its July");
			}else if(index == 8){
				System.out.println("Month index "+ index+" is in Q3, its August");
			}else if(index == 9){
				System.out.println("Month index "+ index+" is in Q3, its September");
			}
		}

		if(index >= 10 && index <= 12){
			if(index == 10){
				System.out.println("Month index "+ index+" is in Q4, its October");
			}else if(index == 11){
				System.out.println("Month index "+ index+" is in Q4, its November");
			}else if(index == 12){
				System.out.println("Month index" + index+" is in Q4, its December");
			}
		}
		if(index <= 0 || index > 12){
			if(index < 0){
				System.out.println("Invalid month index : "+ index+" it can't be negative");
			}else if(index == 0){
				System.out.println("Invalid month index : " + index+ " it can't be 0");
			}else if(index > 12){
				System.out.println("Invalid month index : "+ index+ " it can't be greater than 12");
			}
		}
	}

	public static void main(String[] args){
		NestedIfElse nestedIfElse=new NestedIfElse();
		nestedIfElse.getMonthQuaterName(5);
		nestedIfElse.getMonthQuaterName(2);
		nestedIfElse.getMonthQuaterName(-3);
		nestedIfElse.getMonthQuaterName(13);
	}

}