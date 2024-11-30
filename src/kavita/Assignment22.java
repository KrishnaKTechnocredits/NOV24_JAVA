package kavita;
/*write a method to return total number of digits from the given input.
print the count in main method.input : aa1kan33ks4h5a
output : total 5 digits are there in given input.*/
/*getCountOfDigit(String str)--->Used to get digits from string
 * getCountOfChar(String str)--->Used to get characters from string*/
/*Time:26m*/
public class Assignment22 {
	int stringLength;
	
	//Method getCountOfDigit(String str)--->Used to get digits from string
	int getCountOfDigit(String str) {
		int count=0;
		stringLength=str.length();//get the string length
		for(int index=0;index<stringLength;index++) {
			if(Character.isDigit(str.charAt(index))) {
				count++;
			}
		}
		System.out.println("Total number of digits present in "+ str + " = "+count);
		return count;
	}
	
	//Method getCountOfChar(String str)--->Used to get characters from string
	int getCountOfChar(String str) {
		int count1=0;
		int index1;
		stringLength=str.length();
		for(index1=0;index1<stringLength;index1++) {
			if(Character.isAlphabetic(str.charAt(index1))) {
				count1++;
			}
		}
		System.out.println("Total number of Alphabets present in "+ str + " = "+count1);
		return count1;
		
	}
	
	public static void main(String[] args) {
		Assignment22 assignment22=new Assignment22();
		assignment22.getCountOfDigit("aa1kan33ks4h5a");
		assignment22.getCountOfChar("aa1kan33ks4h5a");
	}
}
