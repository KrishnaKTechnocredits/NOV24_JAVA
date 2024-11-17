package PankajP;

public class Calculator 
{

	int num1=10;
	int num2=20;
	int add;
	
	void add()
	{
		add=num1+num2;
		System.out.println("The addition will be==>>"+add);
		
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add();

	}

}
