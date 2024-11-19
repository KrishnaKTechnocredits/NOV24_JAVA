package nitishM;

public class Conditional1 {
	
	void grades(int score){
		if(score <=100 && score >90) {
			System.out.println("A+");
		}else if(score <=90 && score >80 ) {
			System.out.println("A");
		}else if(score <=80 && score >70) {
			System.out.println("B+");
		}else if(score <=70 && score >60) {
			System.out.println("B");
		}else if(score <=60 && score >=50) {
			System.out.println("C");
		}else if(score <50 && score >=0) {
			System.out.println("Work Harder");
		}else {
			System.out.println("Invalid Score");
		}
	}

	public static void main(String[] args) {
		Conditional1 conditional1 = new Conditional1();
		conditional1.grades(102);

	}

}
