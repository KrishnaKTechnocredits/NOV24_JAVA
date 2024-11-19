package kishorR;

public class Assignment10_Nested {
	void checkQuarter(int month) {
		if(month>=1 && month<=3) {
			if(month==1) {
				System.out.println("Month index in "+month+" in Q1.its Jan");
			}
			else if(month ==2) {
				System.out.println("Month index in "+month+" in Q1.its Feb");
			}
			else {
				System.out.println("Month index in "+month+" in Q1.its March");
			}
		}
		if(month>=4 && month<=6) {
			if(month==4) {
				System.out.println("Month index in "+month+" in Q2.its April");
			}
			else if(month==5) {
				System.out.println("Month index in "+month+" in Q2.its May");
			}
			else {
				System.out.println("Month index in "+month+" in Q2.its June");
			}
		}
		if(month>=7 && month<=9) {
			if(month==7) {
				System.out.println("Month index in "+month+" in Q3.its July");
			}
			else if(month==8) {
				System.out.println("Month index in "+month+" in Q3.its Aug");
			}
			else {
				System.out.println("Month index in "+month+" in Q1.its Sep");
			}
		}
		if(month>=10 && month<=12) {
			if(month==10) {
				System.out.println("Month index in "+month+" in Q4.its Oct");
			}
			else if(month==11) {
				System.out.println("Month index in "+month+" in Q4.its Nov");
			}
			else {
				System.out.println("Month index in "+month+" in Q4.its Dec");
			}
		}
		if(month>=13 || month<0){
			if(month>=13) {
			System.out.println("invalid month index, it can't be greater than 13");
			}
			else {
				System.out.println("invalid month index, it can't be negative");
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment10_Nested assignment10_nested = new Assignment10_Nested();
		assignment10_nested.checkQuarter(5);
		assignment10_nested.checkQuarter(2);
		assignment10_nested.checkQuarter(-3);
		assignment10_nested.checkQuarter(13);
	}
}
