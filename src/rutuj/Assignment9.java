package rutuj;

public class Assignment9 {
	
	void result(int marks)
	{
		if(marks<=100 && marks>=90)
		{
			System.out.println("A+");
		}
		else if(marks<=90 && marks>=80)
		{
			System.out.println("A+");
		}
		else if(marks<=80 && marks>=70)
		{
			System.out.println("B+");
		}
		else if(marks<=70 && marks>=60)
		{
			System.out.println("B");
		}
		else if(marks<=60 && marks>=50)
		{
			System.out.println("C");
		}
		else if(marks<=50 && marks>=0)
		{
			System.out.println("Work Herder");
		}
		else
		{
			System.out.println("Invalid Score");
		}

	}
	public static void main(String[] ags)
	{
		Assignment9 ex3 = new Assignment9();
		ex3.result(92);
		ex3.result(76);
		ex3.result(23);
		ex3.result(-19);
		ex3.result(102);
	}

}
