/*Assignment - 25 : 2nd Dec'2024 [20 mins]
Sum of all the digits present in a given String. 
input : "te1ch2no3cre7dits"
output : 13
input : "techno"
output : 0
input : "4563"
output : 18
-----------------------------------------------------------------*/
package ajay;

public class Assignment25 {
	
	void findChar(String input) {
		int sum=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isDigit(ch)) {
				int numericvalue=Character.getNumericValue(ch);
				sum=sum+numericvalue;
			}
		}System.out.println("Sum of Digits in given strings are =" +sum);
	}

	public static void main(String[] args) {
		Assignment25 assignment25=new Assignment25();
		assignment25.findChar("te1ch2no3cre7dits");
		assignment25.findChar("techno");
		assignment25.findChar("4563");
		
	}

}
