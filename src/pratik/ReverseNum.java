package pratik;

public class ReverseNum {
	void processData() {
		int count = 0;
		for (int i = 500; i >= 10; i--) {
			if (i % 5 == 0) {
				System.out.println(i);
				count++;
				if (count == 5) {
					break;
				}

			}

		}
		System.out.println(count);
	}

	public static void main(String[] a) {
		ReverseNum reversen = new ReverseNum();
		reversen.processData();
	}

}
