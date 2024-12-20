package vidya_pattern;

public class Assignment42 {
	void display() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment42 aa = new Assignment42();
		aa.display();
	}

}
