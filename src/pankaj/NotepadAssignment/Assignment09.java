package pankaj.NotepadAssignment;

public class Assignment09 
{
	
	void student_score(int num)
	{
		if(num>90 && num<=100)
		{
			System.out.println("The student has passed with A+");
		}
		else if(num>80 && num<=90)
		{
			System.out.println("The student has passed with A");
		}
		else if(num>70 && num<=80)
		{
			System.out.println("The student has passed with B+");
		}
		else if(num>60 && num<=70)
		{
			System.out.println("The student has passed with B+");
		}
		else if(num>=50 && num<=60)
		{
			System.out.println("The student has passed with C+");
		}
		else if(num>50 && num<=0)
		{
			System.out.println("The student need to work harder");
		}
		else
		{
			System.out.println("Invalid score");
		}
	}
	public static void main(String[] args) 
	{
		Assignment09 assignment9=new Assignment09();
		assignment9.student_score(92);
		assignment9.student_score(76);
		assignment9.student_score(23);
		assignment9.student_score(19);
		assignment9.student_score(102);
				
		
		
	}

}



