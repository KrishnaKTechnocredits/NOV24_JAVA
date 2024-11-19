package rushikesh;

public class Assignment_10 {
	
	void monthIndex(int month) {
		String[] quarter= {"Q1","Q2","Q3","Q4"};
		String[] monthName= {"January","Februry","March","April","May","June","July","August","September","October","November","December"};
		
		if(month>=0 && month<=12) {
			if(month>=0 && month<=3) {
				System.out.println("Month index "+month+" is in "+quarter[0]+" Quarter");
				if(month==1) {
					System.out.println(monthName[0]+" Month");
					System.out.println();
				}else if(month==2) {
					System.out.println(monthName[1]+" Month");
					System.out.println();
				}else if(month==3) {
					System.out.println(monthName[2]+" Month");
					System.out.println();
				}
			}
	    
			if(month>=4 && month<=6) {
				System.out.println("Month index "+month+" is in "+quarter[1]+" Quarter");
				if(month==4) {
					System.out.println(monthName[3]+" Month");
					System.out.println();
				}else if(month==5) {
					System.out.println(monthName[4]+" Month");
					System.out.println();
				}else if(month==6) {
					System.out.println(monthName[5]+" Month");
					System.out.println();
				}
			}
		
			if(month>=7 && month<=9) {
				System.out.println("Month index "+month+" is in "+quarter[2]+" Quarter");
				if(month==7) {
					System.out.println(monthName[6]+" Month");
					System.out.println();
				}else if(month==8) {
					System.out.println(monthName[7]+" Month");
					System.out.println();
				}else if(month==9) {
					System.out.println(monthName[8]+" Month");
					System.out.println();
				}
			}
		
			if(month>=10 && month<=12) {
				System.out.println("Month index "+month+" is in "+quarter[3]+" Quarter");
				if(month==10) {
					System.out.println(monthName[9]+" Month");
					System.out.println();
				}else if(month==11) {
					System.out.println(monthName[10]+" Month");
					System.out.println();
				}else if(month==12) {
					System.out.println(monthName[11]+" Month");
					System.out.println();
				}
			}
		
		}
		
		else {
			System.out.println("Invalid Month");
			System.out.println();
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
