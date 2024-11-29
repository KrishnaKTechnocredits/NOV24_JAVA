package nitesh;

public class MonthIndex {
	int index;
	
	void MonthValidator(int indexvalue) {
		index = indexvalue;
		if (index <= 3 && index >0) {
			if(index ==1) {
				System.out.println("Month index 1 is in Q1, its january");
			}else if (index==2) {
				System.out.println("Month index 2 is in Q1, its Febuary");
			}else if (index==3) {
				System.out.println("Month index 3 is in Q1, its March");
			}
		}else if(index <=6 && index >3) {
			if(index ==4) {
				System.out.println("Month index 4 is in Q2, its April");
			}else if (index==5) {
				System.out.println("Month index 5 is in Q2, its May");
			}else if (index==6) {
				System.out.println("Month index 6 is in Q2, its June");
			}						
		}else if(index <=9 && index >6) {
			if(index ==7) {
				System.out.println("Month index 7 is in Q3, its July");
			}else if (index==8) {
				System.out.println("Month index 8 is in Q3, its August");
			}else if (index==9) {
				System.out.println("Month index 9 is in Q3, its September");
			}
		}else if(index <=12 && index >9) {
			if(index ==10) {
				System.out.println("Month index 10 is in Q4, its October");
			}else if (index==11) {
				System.out.println("Month index 11 is in Q4, its November");
			}else if (index==12) {
				System.out.println("Month index 12 is in Q4, its December");
			}
		}else if(index <0){
				System.out.println("invalid month index, it can't be negative");
		}else{
			System.out.println("invalid month index, it can't be greater than 13.");
		}
	}
	public static void main(String[] args) {
		MonthIndex monthindex = new MonthIndex();
		monthindex.MonthValidator(5);
		monthindex.MonthValidator(2);
		monthindex.MonthValidator(8);
		monthindex.MonthValidator(10);
		monthindex.MonthValidator(-3);
		monthindex.MonthValidator(13);
	}
}
