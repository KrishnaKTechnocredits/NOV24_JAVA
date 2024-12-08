package pratiksha;

public class Assignment22 {
	/*
	 write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
	 */
	int getCountofDigit(String str) {
		int count = 0;
		
		for(int i=0; i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Assignment22 assign22= new Assignment22();
		int countofDigits=assign22.getCountofDigit("aa1kan33ks4h5a");
		System.out.println("The count of digits in the given string is: "+ countofDigits);
	}

}
