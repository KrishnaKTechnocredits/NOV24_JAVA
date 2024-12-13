package krishna;

public class Assignment40 {
	
	void printPattern() {
		int count = 1;
		for(int i =1;i<=4;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(count++ + " ");
			}
			System.out.print(System.lineSeparator());
		}
	}

	public static void main(String[] args) {
		new Assignment40().printPattern();
	}
}
