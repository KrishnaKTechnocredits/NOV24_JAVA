package prem;

public class Assignment30 {
	
	void evenDigitCount(String str){
		int sum =0;
		for(int i=0;i<= str.length()-1;i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if (digit%2==0) {
					sum = sum+ digit;	
				}
				
			}
			
		}
		System.out.println(sum);
	}
	
	
	
	
	public static void main(String[]args) {
		Assignment30 assign30	= new Assignment30();
		assign30.evenDigitCount("te1ch2no3cre7dits");
		assign30.evenDigitCount("techno");
		assign30.evenDigitCount("4563");
	}

}
