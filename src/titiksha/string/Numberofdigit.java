//write a method to return total number of digits from the given input.
//input : aa1kan33ks4h5a

package titiksha.string;

public class Numberofdigit {
	int count;
	int getTotalNumberOfDigit(String str) {
		System.out.println("Total digits in string is: ");
		for(int index=0;index<str.length();index++) {
			int ch=str.charAt(index);
			boolean flag=Character.isDigit(ch);
			if(flag==true) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Numberofdigit numberofdigit =new Numberofdigit ();
		System.out.println(numberofdigit.getTotalNumberOfDigit("aa1kan33ks4h5a"));
	}
}
