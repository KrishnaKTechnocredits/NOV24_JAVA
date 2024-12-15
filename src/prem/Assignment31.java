package prem;

public class Assignment31 {
	
	void diffEvenOdd(String str){
		int even=0;
		int odd=0;
		for(int i=0;i<= str.length()-1;i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if (digit%2==0) {
					even = even + digit;
				}else 
					odd =odd + digit;
				}	
			}
	       int ans = odd- even;
		   System.out.println("sum of odd & even digits is "+ ans);
	}
	
	public static void main(String[]args) {
		Assignment31 assign31	= new Assignment31();
	    assign31.diffEvenOdd("te1ch2no3cre7dits");
		assign31.diffEvenOdd("4563");
	}

}
