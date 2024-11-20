package MadhuraK;

public class Assignment9_StudentResult {
		
		void getResult(int marks){
			if (marks <= 100 && marks >=90){
				System.out.println ("Congratulations!! You scored A+");
			} else if (marks <= 90 && marks >= 80){
				System.out.println ("Congratulations!! You scored A");
			} else if (marks <= 80 && marks >= 70){
				System.out.println ("Congratulations!! You scored B+");
			}else if (marks <= 70 && marks >= 60){
				System.out.println ("Congratulations!! You scored B");
			}else if (marks <= 60 && marks >= 50){
				System.out.println ("Congratulations!! You scored C");
			}else if (marks <= 50 && marks >= 0){
				System.out.println ("Work harder");
			}else {
				System.out.println ("Invalid score");
			}
		}
			
		public static void main (String [] args){
			Assignment9_StudentResult studentresult = new Assignment9_StudentResult();
			studentresult.getResult(92);
			studentresult.getResult(76);
			studentresult.getResult(23);
			studentresult.getResult(102);
		}
}
