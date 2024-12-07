package krishna;

//find smaller and bigger number
public class Assignment11 {

	void findSmallerNumber(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1 + " is smaller than "  + num2);
		} else
			System.out.println(num2 + " is smaller than "  + num1);
	}
	
	void findBiggerNumber(int num1 , int num2) {
		if(num1>num2) {
			System.out.println(num1 + " is bigger than " + num2);
		}else
			System.out.println(num2 + " is bigger than " + num1);
	}
	
	public static void main(String[] args) {
		Assignment11 test = new Assignment11();
		test.findSmallerNumber(10, 17);
		test.findBiggerNumber(17, 10);
	}
}