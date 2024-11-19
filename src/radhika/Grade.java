package radhika;
public class Grade {

    
    void printGrade(int score) {
        if (score > 90 && score <= 100) {
            System.out.println("A+");
        } else if (score > 80 && score <= 90) {
            System.out.println("A");
        } else if (score > 70 && score <= 80) {
            System.out.println("B+");
        } else if (score > 60 && score <= 70) {
            System.out.println("B");
        } else if (score >= 50 && score <= 60) {
            System.out.println("C");
        } else if (score > 0 && score < 50) {
            System.out.println("work harder");
        } else {
            System.out.println("Invalid score");
        }
    }
    public static void main(String[] args) {
        Grade G=new Grade();
        System.out.print("Student's Grade as per provided Input: ");
        G.printGrade(92);
        System.out.print("Student's Grade as per provided Input: ");
        G.printGrade(76);
        System.out.print("Student's Grade as per provided Input: ");
        G.printGrade(23);
        System.out.print("Student's Grade as per provided Input: ");
        G.printGrade(-19);
        System.out.print("Student's Grade as per provided Input: ");
        G.printGrade(102);
       }
}
