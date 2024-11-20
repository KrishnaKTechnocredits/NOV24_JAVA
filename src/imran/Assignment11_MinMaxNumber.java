package imran;

public class Assignment11_MinMaxNumber {

	void minNum(int num1, int num2)
	{
		if(num1< num2)
		{
			System.out.println(num1 + " is the Smallest number");
		}
		else
		{
			System.out.println(num2 +" is the Smallest number");
		}
	}
	
	void maxNum(int num1, int num2)
	{
		if(num1> num2)
		{
			System.out.println(num1 + " is the Largest number");
		}
		else
		{
			System.out.println(num2 +" is the largest number");
		}
	}
	
	public static void main(String[] args) {
		Assignment11_MinMaxNumber assignment11_MinMaxNumber_1=new Assignment11_MinMaxNumber();
		assignment11_MinMaxNumber_1.minNum(10, 17);
		assignment11_MinMaxNumber_1.maxNum(10,17);
		}
}
