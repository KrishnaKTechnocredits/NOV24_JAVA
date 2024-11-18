package rushikeshK;

public class Assignment_10 {
	
	void monthIndex(int month) {
		String[] quarter= {"Q1","Q2","Q3","Q4"};
		
		if(month>=0 && month<=3) {
			System.out.println("Month index "+month+" is in "+quarter[0]);
		}
		else if(month>=4 && month<=6) {
			System.out.println("Month index "+month+" is in "+quarter[1]);
		}
		else if(month>=7 && month<=9) {
			System.out.println("Month index "+month+" is in "+quarter[2]);
		}
		else if(month>=10 && month<=12) {
			System.out.println("Month index "+month+" is in "+quarter[3]);
		}
		else {
			System.out.println("invalid month index");
	    }
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_10 m= new Assignment_10();
		m.monthIndex(5);
		m.monthIndex(2);
		m.monthIndex(-3);
		m.monthIndex(13);
		m.monthIndex(8);
		m.monthIndex(12);
	}

}
