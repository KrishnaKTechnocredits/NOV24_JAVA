package anuja;
/*print even numbers from the given range*/

public class Assignment12 {
	//method using for loop and if statement to print even numbers only.
	void printEvenNumber(int startNum , int endNUm) {
		System.out.println("Below are the even numbers between " +startNum+ " and " +endNUm+ ". \n ");
		for(;startNum<=endNUm;startNum++) {
			if(startNum%2==0) {
				System.out.println(startNum +"\n");
			}
		}
	}
	
	// main method with constructor
	public static void main(String [] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.printEvenNumber(10, 15);
		
	}

}
