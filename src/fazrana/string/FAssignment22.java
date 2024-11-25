//write a method to return total number of digits from the given input.
//print the count in main method.
//
//input : aa1kan33ks4h5a
//output : total 5 digits are there in given input.
//
//Hint : boolean Character.isDigit(ch)

package fazrana.string;

public class FAssignment22 {
	int count=0;
	int getDigit(String str) {
		for (int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int digit=new FAssignment22().getDigit("aa1kan33ks4h5a");
		System.out.println("total "+digit+" digits are there in given input");
	}

}
