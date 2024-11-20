package kishor;

public class Assignment11_GreaterNum {
	void maximumNumber(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1 +" is bigger between "+num1+"&"+num2);
		}
		else if(num2>num1) {
			System.out.println(num2 + " is bigger between "+num1+"&"+num2);
		}
	}
	
	void minimalNumber(int num1,int num2) {
		if(num1<num2) {
			System.out.println(num1+" is smaller between "+num1+"&"+num2);
		}
		else if(num2<num1) {
			System.out.println(num2+" is smaller between "+num1+"&"+num2);
		}
	}
	
	public static void main(String[] args) {
		Assignment11_GreaterNum greaternumber = new Assignment11_GreaterNum();
		greaternumber.maximumNumber(10, 17);
		greaternumber.minimalNumber(10, 17);
	}
}
