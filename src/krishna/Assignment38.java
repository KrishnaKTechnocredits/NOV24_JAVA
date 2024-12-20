package krishna;

public class Assignment38 {
	
	void printPattern() {
		for(int i = 1;i<=4;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print(System.lineSeparator()); 
		}
	}

	public static void main(String[] args) {
		new Assignment38().printPattern();
	}
}
