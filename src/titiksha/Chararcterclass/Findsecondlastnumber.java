//Mock interview program 2
//Program2: From given range find second last number which is divisible by 5 and 7 
//Range: 1 to 50

package titiksha.Chararcterclass;

public class Findsecondlastnumber {

	void secondLastNumber(int startrange, int endrange) {
		int count = 1;
		for (int i = endrange; i >= startrange; i--) {
			if (i % 5 == 0 && i % 7 == 0) {
				if (count == 2)
					System.out.println("The output with first method is:" + i);
				count++;
			}
		}
	}

//method 2
	int secondNumber(int startrange, int endrange) {
		int count = 1;
		for (int i = endrange; i >= startrange; i--) {
			if (i % 5 == 0 && i % 7 == 0) {
				if (count == 2)
					return i;
				count++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Findsecondlastnumber findsecondlastnumber = new Findsecondlastnumber();
		findsecondlastnumber.secondLastNumber(1, 200);

		int number = findsecondlastnumber.secondNumber(1, 200);
		System.out.println("The output with 2nd method is :" + number);
	}
}
