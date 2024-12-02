package swapnil;

public class Assignment25 {
	
	void Sum(String str) {
		int sum=0;
		for(int num = 0;num<str.length();num++) {
			if(Character.isDigit(str.charAt(num))) {
				int num1=Character.getNumericValue(str.charAt(num));
				sum = sum + num1 ;
			}
		}
			System.out.println(+sum);
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		assignment25.Sum("te1ch2no3cre7dits");
		assignment25.Sum("techno");
		assignment25.Sum("4563");

	}

}
