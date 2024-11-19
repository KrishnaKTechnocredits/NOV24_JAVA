package sindhuP;

public class MonthIndex {
	void getMonthDetails(int index){
		String month;
		if(index<=3 && index>=1 ){
			if(index==1) {
				month="January";
			}else if(index==2) {
				month="February";
			}else {
				month="March";
			}
			System.out.println("Input: "+index);
			System.out.println("Month Index "+index+" is in Q1, its "+month);
		}else if(index<=6 && index>=4 ){
			if(index==4) {
				month="April";
			}else if(index==5) {
				month="May";
			}else {
				month="June";
			}
			System.out.println("Input: "+index);
			System.out.println("Month Index "+index+" is in Q2, its "+month);
		}else if(index<=9 && index>=7 ){
			if(index==7) {
				month="July";
			}else if(index==8) {
				month="August";
			}else {
				month="September";
			}
			System.out.println("Input: "+index);
			System.out.println("Month Index "+index+" is in Q3, its "+month);
		}else if(index<=12 && index>=10 ){
			if(index==10) {
				month="October";
			}else if(index==11) {
				month="November";
			}else {
				month="December";
			}
			System.out.println("Input: "+index);
			System.out.println("Month Index "+index+" is in Q4, its "+month);
		}else if(index<0 ){
			System.out.println("Input: "+index);
			System.out.println("Invalid month index, it can not be negative.");
		}else{
			System.out.println("Input: "+index);
			System.out.println("Invalid month index, it can not be greater than 13.");
		}
	}
	
	public static void main(String[] args){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.getMonthDetails(5);
		monthIndex.getMonthDetails(2);
		monthIndex.getMonthDetails(-3);
		monthIndex.getMonthDetails(13);
	}
}
