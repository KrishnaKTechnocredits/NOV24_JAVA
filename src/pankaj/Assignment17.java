package pankaj;

public class Assignment17 {

	void processdata(int endrange, int startrange) {
		int count = 0;
		// int num=0;
		System.out.println("** The last five numbers divisible by 5 are **");
		for (int num = endrange; num >= startrange; num--) {
			if (num % 5 == 0) {
				System.out.println("   = "+num);
				count++;
				if (count == 5) {
					break;

				}

			}

			// count--;
		}
		// System.out.println(num);
	}

	public static void main(String[] args) {

		Assignment17 A17 = new Assignment17();
		A17.processdata(500, 10);
	}

}
