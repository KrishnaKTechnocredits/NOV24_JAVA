package rohanK;

public class Result {

	void marks(int ObatainScore) {
		if(ObatainScore>90 && ObatainScore<=100) {
			System.out.println("Congratulation You got Grade A+");
		}else if(ObatainScore>80 && ObatainScore<=90) {
			System.out.println("Congratulation You got Grade A");
		}else if(ObatainScore>70 && ObatainScore<=80) {
			System.out.println("Congratulation You got Grade B+");
		}else if(ObatainScore>60 && ObatainScore<=70) {
			System.out.println("Congratulation You got Grade B");
		}else if(ObatainScore>50 && ObatainScore<=60) {
			System.out.println("Congratulation You got Grade C");
		}else if(ObatainScore>=0 && ObatainScore<=50) {
			System.out.println("You need to work Hard");
		}else{
			System.out.println("Please give valid input");
		}
		
	}
	public static void main(String[] args) {
		Result result = new Result();
		result.marks(92);
		result.marks(73);
		result.marks(23);
		result.marks(-10);
		result.marks(102);
	}

}
