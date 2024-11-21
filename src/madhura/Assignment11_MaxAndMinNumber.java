package madhura;

public class Assignment11_MaxAndMinNumber {
	
	void smallernumber(int num1,int num2) {
		if (num1<num2) {
			System.out.println (num1 + " is smaller number between " +num1+ " and " +num2);
		}else {
			System.out.println (num2 + " is smaller number between " +num1+ " and " +num2);
		}
	}
	
	void biggernumber(int num1,int num2) {
		if (num1>num2) {
			System.out.println (num1 + " is bigger number between " +num1+ " and " +num2);
		}else {
			System.out.println (num2 + " is bigger number between " +num1+ " and " +num2);
		}
	}

	public static void main(String[] args) {
		Assignment11_MaxAndMinNumber maxandminnumber = new Assignment11_MaxAndMinNumber();
		maxandminnumber.smallernumber(10,17);
		maxandminnumber.biggernumber(10,17);
	}
}
