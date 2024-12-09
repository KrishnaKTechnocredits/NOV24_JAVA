package nitish;

public class Count {
	void output() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Count c = new Count();
		c.output();

	}
}
