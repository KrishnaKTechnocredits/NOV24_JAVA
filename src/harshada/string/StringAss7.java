//Assignment - 25 : 2nd Dec'2024 [20 mins]
//
//Sum of all the digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 13
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 18

package harshada.string;

public class StringAss7 {

	void getSumFromStr(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// to check if char is digit or not
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);// getting numeric value of digit from ascii
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		StringAss7 stringAss7 = new StringAss7();
		stringAss7.getSumFromStr("te1ch2no3cre7dits");
		stringAss7.getSumFromStr("techno");
		stringAss7.getSumFromStr("4563");
	}
}
