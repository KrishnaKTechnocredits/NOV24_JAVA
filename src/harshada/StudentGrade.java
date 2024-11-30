package harshada;

public class StudentGrade {
	
	void findGrade(int score) {
		if(score>90&&score<=100) {
			System.out.println("Score - "+score+" Grade - A+");
		}
		else if(score>80&&score<=90) {
			System.out.println("Score - "+score+" Grade - A");
		}
		else if(score>70&&score<=80) {
			System.out.println("Score - "+score+" Grade - B+");
		}
		else if(score>60&&score<=70) {
			System.out.println("Score - "+score+" Grade - B");
		}
		else if(score>=50&&score<=60) {
			System.out.println("Score - "+score+" Grade - C");
		}
		else if(score>=0&&score<50) {
			System.out.println("Work harder");
		}
		else
			System.out.println("Invalid score");
	}

	public static void main(String[] args) {
		StudentGrade studentGrade= new StudentGrade();
		studentGrade.findGrade(92);
		studentGrade.findGrade(76);
		studentGrade.findGrade(23);
		studentGrade.findGrade(-19);
		studentGrade.findGrade(102);
	}
}
