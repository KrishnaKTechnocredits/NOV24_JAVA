package nitish;

public class Count2 {
	void output() {
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Count2 count = new Count2();
		count.output();

	}
}
