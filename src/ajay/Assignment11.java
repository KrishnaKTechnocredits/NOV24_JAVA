package ajay;

public class Assignment11 {
	
	void minOf2(int num1, int num2) {
		if(num1<num2) {
			System.out.println(+num1 +" is Smaller between " +num1 +" and " +num2);
		}else {
			System.out.println(+num2 +" is Smaller between " +num1 +" and " +num2);
		}
	}
	void maxOf2(int num1, int num2) {
		if(num1>num2) {
			System.out.println(+num1 +" is bigger between " +num1 +" and " +num2);
		}else {
			System.out.println(+num2 +" is bigger between " +num1 +" and " +num2);
		}
	}

	public static void main(String[] args) {
		Assignment11 maxmin=new Assignment11();
		maxmin.minOf2(10,17);
		maxmin.maxOf2(10,17);
	}

}