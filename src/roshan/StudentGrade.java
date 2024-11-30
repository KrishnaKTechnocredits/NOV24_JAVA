package roshan;

public class StudentGrade {
	int grade;
	
  static void gradeSystem (int grade) {
	  if(grade > 90 && grade <= 100)
        {
		System.out.println("passed with A+ grade");
        }
	  else if (grade > 80 && grade <= 90)
        {
	    System.out.println("passed with A grade");
        }
		
      else if (grade > 70 && grade <= 80)
        {
	    System.out.println("passed with B+ grade");
        }
      else if(grade > 60 && grade <= 70)
        {
		System.out.println("passed with B grade");
        }
      else if(grade > 50 && grade <= 60)
        {
	    System.out.println("passed with c grade");
        }
      else if(grade > 0 && grade <= 50)
        {
		System.out.println("passed Work Hard");
        }
      else if (grade < 0 || grade > 100)
        {
    	 System.out.println("In-valid input");
	    }
     }  
  
      public static void main(String[] args) {
    	  StudentGrade.gradeSystem(60);
      }
}

