package rutuj;

public class Assignment2{
	
	int add;
	int sub; 
	int div;
	int multi;
	int Totalans;
	int num1=10, num2=2;
	
	void Addition()
	{
		add = num1 + num2;
		
	}
	void sub()
	{
		sub = num1 - num2;
		
	}
	void div()
	{
		div = num1 / num2;
	}
	void multi()
	{
		multi = num1 * num2;
	}
	
	void Totalans()
	{
		Totalans = add + sub + div + multi;
		System.out.println("Totalans " + Totalans);
	}
	
	public static void main(String[] args)
	{
		Assignment2 ex3 = new  Assignment2();
		ex3.Addition();
		ex3.sub();
		ex3.multi();
		ex3.div();
		ex3.Totalans();
		
	}
	
	}


