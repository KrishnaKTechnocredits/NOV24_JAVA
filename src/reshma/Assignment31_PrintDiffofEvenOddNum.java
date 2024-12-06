package reshma;

public class Assignment31_PrintDiffofEvenOddNum {
	char ch;
	void printSumOfEvenNum(String str) {
		int SumOfEvenNum = 0;
		int SumOfOddNum = 0;
		int Diff = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int num = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
				if (num % 2 == 0) {
					SumOfEvenNum += num;
				} else {
					SumOfOddNum += num;
				}
			}
			Diff = SumOfOddNum - SumOfEvenNum;
		}
		System.out.println("The diff of Sum of all the odd digits and even digits is: " + Diff);
	}

	public static void main(String[] args) {
		Assignment31_PrintDiffofEvenOddNum assignment31 = new Assignment31_PrintDiffofEvenOddNum();
		assignment31.printSumOfEvenNum("te1ch2no3cre7dits");
		assignment31.printSumOfEvenNum("4563");
	}
}
