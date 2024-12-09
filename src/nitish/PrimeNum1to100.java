package nitish;

public class PrimeNum1to100 {
	void output(int num) {
		for (int i = 2; i <= num; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		PrimeNum1to100 p = new PrimeNum1to100();
		p.output(100);

	}

}
