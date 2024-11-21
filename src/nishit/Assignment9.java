package nishit;

public class Assignment9
{
	int inputResult;
	
	void studentGrade(int result)
	{
		if(result > 90 && result <= 100)
		{
			inputResult = result;
			System.out.println("Result is: " + inputResult);
			System.out.println("Grade is: A+");
		}
		
		if(result > 80 && result <= 90)
		{
			inputResult = result;
			System.out.println("Result is: " + inputResult);
			System.out.println("Grade is: A");
		}
		
		if(result > 70 && result <= 80)
		{
			inputResult = result;
			System.out.println("Result is: " + inputResult);
			System.out.println("Grade is: B+");
		}
		
		if(result > 60 && result <= 70)
		{
			inputResult = result;
			System.out.println("Result is: " + inputResult);
			System.out.println("Grade is: B");
		}
		
		if(result >= 50 && result <= 60)
		{
			inputResult = result;
			System.out.println("Result is: " + inputResult);
			System.out.println("Grade is: C");
		}
		
		if(result > 0 && result < 50)
		{
			inputResult = result;
			System.out.println("Result is: " + inputResult);
			System.out.println("Grade is: Work Harder");
		}
		
		if(result < 0 || result > 100)
		{
			inputResult = result;
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String[] args)
	{
		Assignment9 assignment9 = new Assignment9();
		assignment9.studentGrade(92);
		assignment9.studentGrade(76);
		assignment9.studentGrade(23);
		assignment9.studentGrade(-19);
		assignment9.studentGrade(102);
	}
}
