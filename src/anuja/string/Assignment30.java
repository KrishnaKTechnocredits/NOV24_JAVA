package anuja.string;

/*Sum of all the even digits present in a given String. 

input : "te3ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 30 my ans is--10

*/ 
public class Assignment30 {

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		
		String str1 = "te3ch2no3cre7dits";
		int evenSum1 = assignment30.getEvenSum(str1);
		System.out.println("Sum of all even numbers from a given String: " + str1 + " is -> " + evenSum1);
		System.out.println("-------------------------------------------------------------------------------");
		
		String str2 = "techno";
		int evenSum2 = assignment30.getEvenSum(str2);
		System.out.println("Sum of all even numbers from a given String: " + str2 + " is -> " + evenSum2);
		System.out.println("-------------------------------------------------------------------------------");
		
		String str3 = "4563";
		int evenSum3 = assignment30.getEvenSum(str3);
		System.out.println("Sum of all even numbers from a given String: " + str3 + " is -> " + evenSum3);
		System.out.println("-------------------------------------------------------------------------------");

	}

	public int getEvenSum(String str) {
		int sum = 0;
		int num = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				num = Character.getNumericValue(str.charAt(i));

				if (num % 2 == 0) {
					sum = sum + num;
				}
			}

		}
		return sum;

	}

}
