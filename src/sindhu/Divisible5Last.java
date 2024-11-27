package sindhu;

public class Divisible5Last {
	int lastNum= 0;
	int getLastDivNumber(int endIndex, int startIndex) {
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
		int lastNumber = divisible5Last.getLastDivNumber(498, 10);
		System.out.println(lastNumber+" is the last number which is div by 5 in the given range.");
	}
}
