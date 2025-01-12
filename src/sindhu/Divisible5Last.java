package sindhu;

public class Divisible5Last {
	int lastNum= 0;
	int getLastDivNumber(int startIndex, int endIndex) {
		for (int i = endIndex; i >= startIndex; i--) {
			if (i % 5 == 0) {
			    lastNum = i;
				return lastNum;
			}
		}
		return lastNum;
	}

	public static void main(String[] args) {
		Divisible5Last divisible5Last = new Divisible5Last();
		int lastNumber = divisible5Last.getLastDivNumber(10, 498);
		System.out.println(lastNumber+" is the last number which is div by 5 in the given range.");
		if (lastNumber == 0) {
			System.out.println("There is no such number which is divisible by 5 in the given range.");
		} else {
			System.out.println(lastNumber + " is the last number which is divisible by 5 in the given range.");
		}
	}
}
