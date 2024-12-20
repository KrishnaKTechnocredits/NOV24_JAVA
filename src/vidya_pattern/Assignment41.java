package vidya_pattern;

public class Assignment41 {

	void display() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment41 ass41 = new Assignment41();
		ass41.display();
	}
}
