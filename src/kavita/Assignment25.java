package kavita;

/*Sum of all the digits present in a given String. 
input : "te1ch2no3cre7dits"
output : 13
*//*Time:15m */
public class Assignment25 {
	int getSumOfDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				int ch=Character.getNumericValue(str.charAt(index));
				sum = sum+ch;
			}
		}
		return sum;
        
	}
	public static void main(String[] args) {
	
		Assignment25 assignment25 = new Assignment25();
		String str = "te1ch2no3cre7dits";
		int sumOfDigits = assignment25.getSumOfDigits(str);
		System.out.println("The sum of digits in given String " + str + " is " + sumOfDigits);
	
	}
}
		

