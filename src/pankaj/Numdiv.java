package pankaj;

public class Numdiv {
	int num;

	void numdivone(int startrange, int endrange) {
		int count = 0;
		System.out.println("** The first 3 numbers devisible by 3 and 4 are **");
		for (int num = startrange; num < endrange; num++) {

			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println("  ==>> " + num);
				count++;
			}
			if (count == 3) {
				// System.out.println(count);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Numdiv nd = new Numdiv();
		nd.numdivone(10, 500);
	}
}
