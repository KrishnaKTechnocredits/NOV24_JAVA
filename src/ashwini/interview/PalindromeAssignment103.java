package ashwini.interview;

/*
 Assignment 103: Check for Palindrome
📥 Input: naman, 1221
✅ naman is a palindrome string
✅ 1221 is a palindrome number
❌ techno is not a palindrome string
❌ 1211 is not a palindrome number

💡 Hint: A palindrome remains the same when reversed.
 */
public class PalindromeAssignment103 {
	int getRevNum(int num) {
		int revereseNum = 0;
		while (num != 0) {
			// get last digit
			int digit = num % 10;
			revereseNum = revereseNum * 10 + digit;
			// remove last digit
			num = num / 10;
		}
		return revereseNum;
	}

	public static void main(String[] args) {
		RevNumAssignment102 revNum = new RevNumAssignment102();
		int num = 1221;
		String name = "naman";
		int revNum1 = revNum.getRevNum(num);
		if (num == revNum1) {
			System.out.println(revNum1 + " is a pallindrom number");
		} else {
			System.out.println(revNum1 + " is not a pallindrom number");
		}
		StringBuilder revName = new StringBuilder(name);
		StringBuilder revName2 = revName.reverse();
		if (revName.equals(revName2)) {
			System.out.println(revName2 + " is a pallindrom String");
		} else {
			System.out.println(revName2 + " is not a pallindrom String");
		}
	}
}
