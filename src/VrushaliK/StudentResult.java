package VrushaliK;

//Assignment - 9 : 18th Nov'2024
//
//Print student grade based on obtain score.
//
//If score is between 90 (excluding) to 100 (including) -> "A+"
//If score is between 80 (excluding) to 90 (including) -> "A"
//If score is between 70 (excluding) to 80 (including) -> "B+"
//If score is between 60 (excluding) to 70 (including) -> "B"
//If score is between 50 (including) to 60 (including) -> "C"
//If score is between 50 (excluding) to 0 (including) -> "work harder"
//Any other score should be considered as Invalid score.


public class StudentResult {
	
	void showResult(int marks)
	{
		if(marks>90 && marks<=100)
		{
			System.out.println("Result :A+");
		}
		else if(marks>80 && marks<=90)
		{
			System.out.println("Result :A");
		}
		else if(marks>70 && marks<=80)
		{
			System.out.println("Result :B+");
		}
		else if(marks>60 && marks<=70)
		{
			System.out.println("Result :B");
		}
		else if(marks>50 && marks<=60)
		{
			System.out.println("Result :C");
		}
		else if(marks>0 && marks<=50)
		{
			System.out.println("Work Hard");
		}
		else
		{
			System.out.println("Invalid score");
		}
		
	}
	public static void main(String[] args) {
		StudentResult studentResult=new StudentResult();
		
		studentResult.showResult(92);
		studentResult.showResult(76);
		studentResult.showResult(23);
		studentResult.showResult(-19);
		studentResult.showResult(102);
		
		
	}

}
