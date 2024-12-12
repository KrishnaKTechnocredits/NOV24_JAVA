package nilam.conditionalStatements;

public class Assignment10 {
	void printDetails(int mIndex) {
		int monthIndex=mIndex;
		
		if(monthIndex>=1 && monthIndex<=3) {
			if(monthIndex==1) {
				System.out.println("Month index is " + monthIndex + " is in Q1," + "its " +"January");
				}else if(monthIndex==2) {
					System.out.println("Month index is " + monthIndex + " is in Q1," + "its " +"February");
				}else
					System.out.println("Month index is " + monthIndex + " is in Q1," + "its " +"March");
				}
		
		if(monthIndex>=4 && monthIndex<=6) {
			if(monthIndex==4) {
				System.out.println("Month index is " + monthIndex + " is in Q2," + "its " +"April");
				}else if(monthIndex==5) {
					System.out.println("Month index is " + monthIndex + " is in Q2," + "its " +"May");
				}else {
				System.out.println("Month index is " + monthIndex + " is in Q2," + "its " +"June");
				}
		}
		if(monthIndex>=7 && monthIndex<=9) {
				if(monthIndex==7) {
				System.out.println("Month index is " + monthIndex + " is in Q3," + "its " +"July");
				}else if(monthIndex==8) {
				System.out.println("Month index is " + monthIndex + " is in Q3," + "its " +"August");
				}else{
				System.out.println("Month index is " + monthIndex + " is in Q3," + "its " +"september");
				}
		}
		if(monthIndex>=10 && monthIndex<=12) {
				if(monthIndex==10) {
					System.out.println("Month index is " + monthIndex + " is in Q4," + "its " +"Octomber");
				}else if(monthIndex==11) {
					System.out.println("Month index is " + monthIndex + " is in Q4," + "its " +"November");
				}else{
					System.out.println("Month index is " + monthIndex + " is in Q4," + "its " +"December");
				}
		}
		if (monthIndex<1) {
			System.out.println("Invalid month index, its cant be negative");
			}else if(monthIndex>12){
				System.out.println("Invalid month index, its cant be greater than 12");
			}
		}
	

	
	public static void main(String[] args) {
		Assignment10 assignment10=new Assignment10();
		assignment10.printDetails(5);
		assignment10.printDetails(2);
		assignment10.printDetails(-3);
		assignment10.printDetails(15);
		
	}	
}


