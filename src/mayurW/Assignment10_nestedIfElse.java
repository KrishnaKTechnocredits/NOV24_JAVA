/*
 * Assignment - 10 : 18th Nov'2024

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

package mayurW;

public class Assignment10_nestedIfElse {
	
	void printQtrMonth(int index) {
		if (index>=1 && index<=3) {
			if (index==1) {
				System.out.println("Month index is "+index+" is in Q1, January");
			}else if (index==2) {
				System.out.println("Month index is "+index+" is in Q1, February");
			}else if (index==3) {
				System.out.println("Month index is "+index+" is in Q1, March");
			}
			
		}else if (index>=4 && index<=6) {
			if (index==4) {
				System.out.println("Month index is "+index+" is in Q1, April");
			}else if (index==5) {
				System.out.println("Month index is "+index+" is in Q1, May");
			}else if (index==6) {
				System.out.println("Month index is "+index+" is in Q1, June");
			}
		}else if (index>=7 && index<=9) {
			if (index==7) {
				System.out.println("Month index is "+index+" is in Q1, July");
			}else if (index==8) {
				System.out.println("Month index is "+index+" is in Q1, August");
			}else if (index==9) {
				System.out.println("Month index is "+index+" is in Q1, September");
			}
		}else if (index>=10 && index<=12) {
			if (index==10) {
				System.out.println("Month index is "+index+" is in Q1, October");
			}else if (index==11) {
				System.out.println("Month index is "+index+" is in Q1, November");
			}else if (index==12) {
				System.out.println("Month index is "+index+" is in Q1, December");
			}
		}else if(index<0){
			System.out.println("Invalid month index,it cant be negative");	
		}else {
			System.out.println("Invalid month index, it cant be greater than 12");
		}
	}
	
	public static void main(String[] args) {
		Assignment10_nestedIfElse obj = new Assignment10_nestedIfElse();
		obj.printQtrMonth(5);
		obj.printQtrMonth(2);
		obj.printQtrMonth(-3);
		obj.printQtrMonth(13);
	}
}
		