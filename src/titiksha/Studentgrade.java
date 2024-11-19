package titiksha;

public class Studentgrade {
int score;

void grade(int score) {
	this.score=score;
	if(score >90 && score <= 100) {
		System.out.println("Your grade is A+");}
	else if(score >80 && score <=90) {
		System.out.println("Your grade is A");}
	else if(score >70 && score <= 80) {
		System.out.println("Your grade is B+");}
	else if(score >60 && score <= 70) {
		System.out.println("Your grade is B");}
	else if(score >50 && score <= 60) {
		System.out.println("Your grade is C");}
	else if(score <50 && score>=0) {
		System.out.println("Work hard");}
	else {
		System.out.println("Invalid score");}
     }

	public static void main(String[] args) {
		Studentgrade studentgrade=new Studentgrade();
		studentgrade.grade(92);
		studentgrade.grade(76);
		studentgrade.grade(23);
		studentgrade.grade(-19);
		studentgrade.grade(102);}
}

