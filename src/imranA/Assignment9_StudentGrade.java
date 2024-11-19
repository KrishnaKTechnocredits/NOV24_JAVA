package imranA;

public class Assignment9_StudentGrade {

	void grade(int marks)
	{
		if (marks<=100 && marks>90)
		{
			System.out.println("Student Score A+ grade");
		}
		else if(marks <=90 && marks >80)
		{
			System.out.println("Student Score A grade");
		}
		else if(marks <=80 && marks >70)
		{
			System.out.println("Student Score B+ grade");
		}
		else if(marks <=70 && marks >60)
		{
			System.out.println("Student Score B grade");
		}
		else if(marks <=60 && marks >50)
		{
			System.out.println("Student Score C grade");
		}
		else if(marks <=50 && marks >0)
		{
			System.out.println("Student has to work harder");
		}
		else
		{
			System.out.println("Invalid Marks entered");
		}
	}
	
	public static void main(String[] args) {
		Assignment9_StudentGrade assignment9_StudentGrade1 = new Assignment9_StudentGrade();
		assignment9_StudentGrade1.grade(96);
		assignment9_StudentGrade1.grade(76);
		assignment9_StudentGrade1.grade(23);
		assignment9_StudentGrade1.grade(-19);
		assignment9_StudentGrade1.grade(102);
	}
}
