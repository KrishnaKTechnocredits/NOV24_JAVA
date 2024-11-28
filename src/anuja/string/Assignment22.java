package anuja.string;
/*	//return total number of digits from the given input.
	print the count in main method.*
	logic- use Character.isDigit(str.charAt(index) logic*/

public class Assignment22 {
	int stringLength; //instance variable
	int getCountOfDigitFromGivenString(String str){
	int count = 0;
	stringLength = str.length();//get the length
	for (int index=0;index<stringLength;index++){
		if(Character.isDigit(str.charAt(index))){
		count++;
		}//if condition end
	  }//for loop end	
	System.out.println("getCountOfDigitFromGivenString method executed \n");
	System.out.println("Total numbers of digit present in String " +str+ " = "+count);
	System.out.println("------------------------------- \n");
	//end of getcount method
	return count;
	}
	//one more method to print the number of char in givent string.
	int getCountOfCharFromGivenString(String str){
		int count1 = 0;
		stringLength = str.length();
		for (int index1=0;index1<stringLength;index1++){
			if(Character.isAlphabetic(str.charAt(index1))) {
				count1++;
				}
			}
	
		System.out.println("getCountOfCharFromGivenString method executed \n");
		System.out.println("Total numbers of Alphabetic present in String " +str+ " = "+count1);
		System.out.println("------------------------------- \n");
		return count1;	
	}
	
	public static void main(String [] args){
			Assignment22 assignment22 = new Assignment22();
			assignment22.getCountOfDigitFromGivenString("aa1kan33ks4h5a");
			assignment22.getCountOfCharFromGivenString("aa1kan33ks4h5a");
		}
}
