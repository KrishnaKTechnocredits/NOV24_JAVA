package prem;

public class Month {
	
	void month(int monthIndex) {
		if (monthIndex == 1) {
			System.out.println("Month index " + monthIndex +" is in Q1, its Jan.");
		}else if (monthIndex == 2) {
			System.out.println("Month index " + monthIndex +" is in Q1, its Feb.");	
		}else if (monthIndex == 3) {
			System.out.println("Month index " + monthIndex +" is in Q1, its March.");
		}else if (monthIndex == 4) {
			System.out.println("Month index " + monthIndex +" is in Q2, its April.");
		}else if (monthIndex == 5) {
			System.out.println("Month index " + monthIndex +" is in Q2, its May.");	
		}else if (monthIndex == 6) {
			System.out.println("Month index " + monthIndex +" is in Q2, its June.");
		}else if (monthIndex == 7) {
			System.out.println("Month index " + monthIndex +" is in Q3, its July.");
		}else if (monthIndex == 8) {
			System.out.println("Month index " + monthIndex +" is in Q3, its Aug.");
		}else if (monthIndex == 9) {
			System.out.println("Month index " + monthIndex +" is in Q3, its Sep.");	
		}else if (monthIndex == 10) {
			System.out.println("Month index " + monthIndex +"is in Q4, its Oct.");
		}else if (monthIndex == 11) {
			System.out.println("Month index " + monthIndex +" is in Q4, its Nov.");
		}else if (monthIndex == 12) {
			System.out.println("Month index " + monthIndex +" is in Q4, its Dec.");	
		}else if (monthIndex > 12) {
			System.out.println("Month index " + monthIndex +" is invalid, it can't be greater than 12");	
		}else if (monthIndex <= 0) {
			System.out.println("Month index " + monthIndex +" is invalid, it can't be less than 1 or negative");	
		}
		
	}
		public static void main(String[] args) {
			Month month =new Month();
			month.month(5);
			month.month(2);
			month.month(-3);
			month.month(13);
		}

}
