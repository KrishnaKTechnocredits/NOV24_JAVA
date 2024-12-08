package anuja.anuja_interview;

/*print table 1 to 5*/
public class Assignment36 {

	void printTabel() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				int prod = i * j;
				System.out.println(i + " * " + j + " = " + prod);
			}
			System.out.println("--------------------------------------------------");

		}
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		assignment36.printTabel();
	}
}
