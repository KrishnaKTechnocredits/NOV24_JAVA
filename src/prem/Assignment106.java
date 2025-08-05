package prem;

public class Assignment106 {

	public static void main(String[] args) {
		Assignment106 assign106 = new Assignment106();
		int num = 10;
		assign106.printFibonacci(num);
	}

	private void printFibonacci(int num) {
		System.out.println("Print fibinacci number " + num);

		int numAt0 = 0;
		int numAt1 = 1;
		System.out.print(numAt0 + " " + numAt1 + " ");
		int nextFibonnacci = 0;
		for (int i = 2; i < 10; i++) {
			nextFibonnacci = numAt0 + numAt1;
			System.out.print(nextFibonnacci + " ");
			numAt0 = numAt1;
			numAt1 = nextFibonnacci;
		}
	}
}
