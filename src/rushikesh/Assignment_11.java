package rushikesh;

public class Assignment_11 {
	
	void methodA(int num1,int num2) {
		if (num1<num2) {
			System.out.println(num1+" is smaller between "+num1+" and "+num2);
		}else if(num1>num2) {
			System.out.println(num1+" is bigger between "+num1+" and "+num2);
		}
	}
	
	void methodB(int num1,int num2) {
		if (num2>num1) {
			System.out.println(num2+" is s bigger between "+num1+" and "+num2);
		}else if(num2<num1) {
			System.out.println(num1+" is smaller between "+num1+" and "+num2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_11 assignment_11=new Assignment_11();
		assignment_11.methodA(10,17);
		assignment_11.methodB(10,17);
	}

}
