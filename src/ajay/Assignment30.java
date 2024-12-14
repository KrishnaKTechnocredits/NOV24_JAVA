package ajay;

public class Assignment30 {

	void sumOfEvenNo(String str) {
		int sum=0;
		int count=0;
		for(int i=0;i<str.length();i++) {

			char ch=str.charAt(i);
			boolean flag =Character.isDigit(ch);
			if(flag) {
				count++;
				int digit=Character.getNumericValue(ch);
				if(digit%2==0) {
					sum=sum+digit;
					System.out.println("Sum of Even Numbers in given string is =" +sum);
				}
			}

		}
	}

	public static void main(String[] args) {
		Assignment30 assignment30=new Assignment30();
		assignment30.sumOfEvenNo("te1ch2no3cre7dits");
		assignment30.sumOfEvenNo("techno");
		assignment30.sumOfEvenNo("4563");


	}

}
