package rutuj;

public class Assignment11minandmax {
	
	void minNo(int num1, int num2)
	{
		if(num1<num2)
		{
			System.out.println(num1 + " is smaller between "+ num1 +" and " + num2 );
		}
		else
		{
			System.out.println(num2 + " is bigger between "+ num1 +" and " + num2 );
		}
	}
	void maxNo(int num1, int num2)
	{
		if(num1>num2)
		{
			System.out.println(num2 + " is smaller between "+ num1 +" and " + num2 );
		}
		else
		{
			System.out.println(num2 + " is bigger between "+ num1 +" and " + num2 );
		}
	}
	public static void main(String[] args)
	{
		Assignment11minandmax ex5 = new Assignment11minandmax();
		ex5.minNo(10, 17);
		ex5.maxNo(10, 17);
	}

}
