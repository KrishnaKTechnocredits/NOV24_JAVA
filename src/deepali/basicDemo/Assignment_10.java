package deepali.basicDemo;

public class Assignment_10 {
	String month;
	String Q1;
	String Q2;
	String Q3;
	void displayQuaterMonth(int quater) {
		if(quater >=1 && quater <= 3) {
			if(quater==1) {
				System.out.println("Month index is in"+" " + "Q1" +" " +"its January" );
			}else if(quater==2) {
				System.out.println("Month index is in"+" " + "Q1" +" " +"its February" );
			}else if(quater==3) {
				System.out.println("Month index is in"+" " + "Q1" +" " +"its March" );
			}	
		}else if(quater >=4 && quater <= 6) {
			if(quater==4) {
				System.out.println("Month index is in" +" "+  "Q2" +" "+"its April" );
			}else if(quater==5) {
				System.out.println("Month index is in" +" "+ "Q2" +" "+"its May" );
			}else if(quater==6) {
				System.out.println("Month index is in" +" "+ "Q2" +" "+"its June" );
			}	
		}else if(quater >=7 && quater <= 9) {
			if(quater==7) {
				System.out.println("Month index is in"+" " + "Q3" +" " +"its July" );
			}else if(quater==8) {
				System.out.println("Month index is in"+" " + "Q3" +" " +"its August" );
			}else if(quater==9) {
				System.out.println("Month index is in"+" " + "Q3" +" " +"its September" );
			}	
		}else if(quater >=10 && quater <= 12) {
			if(quater==10) {
				System.out.println("Month index is in"+" " + quater +" " +"its October" );
			}else if(quater==11) {
				System.out.println("Month index is in"+" " + quater +" " +"its November" );
			}else if(quater==12) {
				System.out.println("Month index is in"+" " + quater +" " +"its December" );
			}	
		}else if(quater <=0) {
			System.out.println("Invalid month index, it can't be negative ");
		}else if(quater >12) {
			System.out.println("Invalid month index, it can't be greater than "+quater +"");
		}
	}
	
	public static void main(String[] args) {
		Assignment_10 assignment = new Assignment_10();
		assignment.displayQuaterMonth(5);
		assignment.displayQuaterMonth(2);
		assignment.displayQuaterMonth(-3);
		assignment.displayQuaterMonth(13);
	}
}
