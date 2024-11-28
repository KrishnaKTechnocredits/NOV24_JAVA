package anuja.string;

public class Assignment23_1 {
	//public static String getCountAndCharDigSpace(String str) {
		int upperCount;
		int lowerCount = 0; 
		int digitCount = 0;
		int spaceCount = 0;
		int speicalCharCount = 0;	
		//int stringLength = str.length();
		void getUpperCase(String str) {
			System.out.println("----------------------------------");
			System.out.println("Below are the upper case charactar \n");
			for(int index = 0 ; index< str.length(); index++ ) {
				char ch = str.charAt(index);
				if(Character.isLetter(ch)) {
					if(Character.isUpperCase(ch)) {
						upperCount++;
						System.out.print(ch + " " );
						}
				}
			}// end of for loop.
			System.out.println("\n");
		}//end of upper case method.
		
		void getLowerCase(String str) {
			System.out.println("----------------------------------");
			System.out.println("Below are the lower case charactar \n");
			for(int index = 0 ; index< str.length(); index++ ) {
				char ch = str.charAt(index);
				if(Character.isLetter(ch)) {
					if(Character.isLowerCase(ch)) {
						lowerCount++;
						System.out.print(ch + " ");
						}
				}
			}
			System.out.println("\n");
		}//end of lower case method.
		
		void getNumbersCount(String str) {
			System.out.println("----------------------------------");
			System.out.println("Below are the numbers from string \n");
			for(int index = 0 ; index< str.length(); index++ ) {
				char ch = str.charAt(index);
				if(Character.isDigit(ch)) {
					digitCount++;
					System.out.print(ch + " ");
						}
			}
			System.out.println("\n");
		}//end of digit method
		
		void getSpace (String str) {
			System.out.println("----------------------------------");
			System.out.println("Below are the number of space charactar from string \n");
			for(int index = 0 ; index< str.length(); index++ ) {
				char ch = str.charAt(index);
				if(ch==' ') {
					spaceCount++;
					System.out.print(spaceCount);
						}
			}
			System.out.println("\n");
		}//end of spacecount method
		
		void getSpeialChar (String str) {
			System.out.println("----------------------------------");
			System.out.println("Below are the speical charactar from string \n");
			for(int index = 0 ; index< str.length(); index++ ) {
				char ch = str.charAt(index);
				//write a if condition to compaire all aboe=ve results
				if(!Character.isUpperCase(ch) && 
						!Character.isLowerCase(ch) && 
						!Character.isDigit(ch) && ch != ' '){
						speicalCharCount++;
						System.out.print(speicalCharCount + "\n");
						System.out.print(ch);
						}
			}
		}//end of spacecount method
			

		//end of method
	
	public static void main(String[] args) {
		Assignment23_1 assignment23_1 = new Assignment23_1();
		String inputName = "Te4c_hno Credi3ts";
		assignment23_1.getUpperCase(inputName);
		assignment23_1.getLowerCase(inputName);
		assignment23_1.getNumbersCount(inputName);
		assignment23_1.getSpace(inputName);
		assignment23_1.getSpeialChar(inputName);


	}
}
