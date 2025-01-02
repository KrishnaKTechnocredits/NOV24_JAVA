package nilam.conditionalStatements;

public class Assignment11 {
	int num1,num2;
	
	void maxNum(int no1, int no2) {
		int num1=no1,num2=no2;
		if(num1>num2) {
			System.out.println(num1+" is greater between "+num1+ " and "+num2);
		}else
			System.out.println(num2+" is greater between "+num1+ " and "+num2);
	}
	void minNum(int no1, int no2) {
		int num1=no1,num2=no2;
		if(num1<num2) {
			System.out.println(num1+" is smaller between "+num1+ " and "+num2);
		}else
			System.out.println(num2+" is smaller between "+num1+ " and "+num2);
	}
	
	public static void main(String[] args) {
		Assignment11 assignment11=new Assignment11();
		assignment11.maxNum(10, 17);
		assignment11.minNum(10, 17);
	}

}
