package reshma;

public class Assignment10_MonthDetails {
	void getMonth(int index){
		if(index==1){
			System.out.println(" Month index " + index + " is in Q1, its January.");
			}else if(index==2){
				System.out.println(" Month index " + index + " is in Q1, its February.");
			}else if(index==3){
				System.out.println(" Month index " + index + " is in Q1, its March.");
			}else if(index==4) {
				System.out.println(" Month index " + index + " is in Q1, its April.");
			}else if(index==5) {
				System.out.println(" Month index " + index + " is in Q2, its May.");
			}else if(index==6) {
				System.out.println(" Month index " + index + " is in Q2, its Jun.");
			}else if(index==7) {
				System.out.println(" Month index " + index + " is in Q2, its July.");
			}else if(index==8) {
				System.out.println(" Month index " + index + " is in Q2, its August.");
			}else if(index==9) {
				System.out.println(" Month index " + index + " is in Q3, its September.");
			}else if(index==10) {
				System.out.println(" Month index " + index + " is in Q3, its October.");
			}else if(index==11) {
				System.out.println(" Month index " + index + " is in Q1, its November.");
			}else if(index==12) {
				System.out.println(" Month index " + index + " is in Q1, its December.");
			}else if(index<1){
				System.out.println(" invalid month index, it can't be negative.");
			}else
				System.out.println(" invalid month index, it can't be greater than " +index);

	}

			public static void main(String[]args){
				
				Assignment10_MonthDetails m=new Assignment10_MonthDetails();
				m.getMonth(5);
				m.getMonth(2);
				m.getMonth(-3);
				m.getMonth(13);
	}
}
