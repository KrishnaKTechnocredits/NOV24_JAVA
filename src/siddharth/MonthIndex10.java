package siddharth;

public class MonthIndex10 {
	
	void monthIndex(int index) {
		if(index == 1) {
			System.out.println("Month index "+index+" is in Q1, its January");
		}else if(index == 2) {
			System.out.println("Month index "+index+" is in Q1, its February");
		}else if(index == 3) {
			System.out.println("Month index "+index+" is in Q1, its March");
		}else if(index == 4) {
			System.out.println("Month index "+index+" is in Q2, its April");
		}else if(index == 5) {
			System.out.println("Month index "+index+" is in Q2, its May");
		}else if(index == 6) {
			System.out.println("Month index "+index+" is in Q2, its June");
		}else if(index == 7) {
			System.out.println("Month index "+index+" is in Q3, its July");
		}else if(index == 8) {
			System.out.println("Month index "+index+" is in Q3, its August");
		}else if(index == 9) {
			System.out.println("Month index "+index+" is in Q3, its September");
		}else if(index == 10) {
			System.out.println("Month index "+index+" is in Q4, its October");
		}else if(index == 11) {
			System.out.println("Month index "+index+" is in Q4, its November");
		}else if(index == 12) {
			System.out.println("Month index "+index+" is in Q4, its December");
		}else if(index > 12) {
			System.out.println("invalid month index "+index+" it can't be greater than 13.");
		}else if(index <= 0) {
			System.out.println("invalid month index "+index+" it can't be negative.");
		}
	}
	
	public static void main(String[] args) {
		MonthIndex10 monthIndex10 = new MonthIndex10();
		monthIndex10.monthIndex(5);
		monthIndex10.monthIndex(2);
		monthIndex10.monthIndex(-3);
		monthIndex10.monthIndex(13);
	}
}
