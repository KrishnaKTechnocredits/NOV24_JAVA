package krishna;

public class Assignment43 {
	
	void printPattern() {
		char ch = 'A';
		for(char ch2 = 'A';ch2<='D';ch2++) {
			for(char ch3 = 'A';ch3<=ch2;ch3++) {
				System.out.print(ch++);
			}
			System.out.print(System.lineSeparator());
		}
	}

	public static void main(String[] args) {
		new Assignment43().printPattern();
	}
}
