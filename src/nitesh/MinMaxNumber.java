package nitesh;

public class MinMaxNumber {
	int num1;
	int num2;
	
	void MinNumber(int num1, int num2) {
		this.num1 =num1;
		this.num2 = num2;
		if (num1 <num2) {
			System.out.println(num1+" "+" is smaller between 10 and 17.mn");
		}
	}
	
	void MaxNumber(int num1, int num2) {
			this.num1 =num1;
			this.num2 = num2;
			if (num1 <num2) {
				System.out.println(num2+" "+" is smaller between 10 and 17.mn");
			}	
	}
	
	public static void main(String[] args) {
		MinMaxNumber minmaxnumber =new MinMaxNumber();
		minmaxnumber.MinNumber(10,17);
		minmaxnumber.MaxNumber(10,17);
	}
}
