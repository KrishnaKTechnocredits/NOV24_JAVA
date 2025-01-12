package vidya_pattern;

public class Assignment43 {
	void display() {
		char ch = 'A';
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment43 aa = new Assignment43();
		aa.display();
	}

}
