package anuja;
/*On user defined range print first 3 numbers which is divisible by 3 & 4*/
public class Assignment15 {
	//create a method to print first 3 nums which is devided by 3 and 4.
	
	void printFirstThreeNumsDevisibleBy3And5(int startNum, int endNum) {
		//user for loop to iterate and if else to handle the condition
		int count=0;
		//for loop logic to run a loop untill and unless the startnum is less and equal to end.
		System.out.println("Numbers which are devisible by 3 and 5 are as below \n ");
		for(;startNum <=endNum;startNum++) {
			if(startNum%3==0 && endNum%5==0) {
				System.out.println(startNum+ "\n");
				count++;
				if(count==3) {
					System.out.println("Loop is terminated as 3 numbers are printed as per the requirnment \n");
					break;
				}//end of 2nd if
			}//end of 1st if	
		}//end of for loop
	}//end of methode1
	
	//create a main methode with object to print the 1st 3 nums which divisible by 3 and 5
	public static void main(String[] args) {
		Assignment15 assignment15  = new Assignment15();
		assignment15.printFirstThreeNumsDevisibleBy3And5(10, 500);
	}
}
