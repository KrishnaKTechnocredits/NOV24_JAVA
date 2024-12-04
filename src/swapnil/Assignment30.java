package swapnil;
 
public class Assignment30 {
	
	
	int sumEvenDigit(String str) {
		int sum=0;
		for(int num=0;num<str.length();num++) {
			char ch = str.charAt(num);
			if(Character.isDigit(ch)) {
				int chvalue = Character.getNumericValue(ch);
				if(chvalue%2==0) {
					sum=sum+chvalue;
				
				}
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		System.out.println(+assignment30.sumEvenDigit("te1ch2no3cre7dits"));
		System.out.println(+assignment30.sumEvenDigit("techno"));
		System.out.println(+assignment30.sumEvenDigit("4563"));
		
	}

}


