package pratik;

public class Assignment17 {
	int startRange, endRange;
	int num;
	int count = 0;

	void lastnum(int startRange, int endRange) {
		for (num = endRange; num >= startRange; num--) {
			if (num % 5 == 0) {
				count++;
				System.out.println(num);
				if (count == 5) {
					break;
				}

			}

		}

	}

	public static void main(String[] args) {
		Assignment17 a = new Assignment17();
		System.out.println("Last 5 numbers divisible by 5 is : ");
		a.lastnum(10, 500);

	}

}
