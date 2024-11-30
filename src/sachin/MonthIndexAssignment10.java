package sachin;


public class MonthIndexAssignment10 {
	
	void monthInfo(int index) {
		if(index>=1 && index<=3) {
			System.out.println("Month index is "+index+ " is in Q1");
			if (index==1) {
				System.out.println("Month is January");
			}else if(index==2) {
				System.out.println("Month is February");
			}else {
				System.out.println("Month is March");
			} 
			System.out.println();
		}else if(index>=4 && index<=6) {
			System.out.println("Month index is "+index+ " is in Q2");
			if (index==4) {
				System.out.println("Month is April");
			}else if(index==5) {
				System.out.println("Month is May");
			}else {
				System.out.println("Month is June");
			} 
			System.out.println();
		}else if(index>=7 && index<=9) {
			System.out.println("Month index is "+index+ " is in Q3");
			if (index==7) {
				System.out.println("Month is July");
			}else if(index==8) {
				System.out.println("Month is August");
			}else {
				System.out.println("Month is September");
			} 
			System.out.println();
		}else if(index>=10 && index<=12) {
			System.out.println("Month index is "+index+ " is in Q4");
			if (index==10) {
				System.out.println("Month is October");
			}else if(index==11) {
				System.out.println("Month is November");
			}else {
				System.out.println("Month is December");
			} 
			System.out.println();
		}else if (index<0){
			System.out.println("invalid month index, it can't be negative.");
		}else {
			System.out.println("invalid month index, it can't be greater than 12");
		}
	}
	
	public static void main(String[] args) {
		MonthIndexAssignment10 assignment10=new MonthIndexAssignment10();
		assignment10.monthInfo(5);
		assignment10.monthInfo(2);
		assignment10.monthInfo(-3);
		assignment10.monthInfo(13);
	}
}


