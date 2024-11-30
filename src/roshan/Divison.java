package roshan;

public class Divison{
	
	static void range (int startRange , int endRange){
		int num = 0;
		int count=0;
		for( num = startRange ; num<=endRange ;num++) {
			if (num % 3==0 && num % 4 ==0) {
				System.out.println("On user defined range first 3 numbers which is divisible by 3 & 4 are  " + num); //mistake after break statement sop was added
		        count++;
		        if (count == 3) {
		        break;
		        }        	
		        
			}

		}
	}	
	public static void main(String[] args) {
		
		Divison.range (1,100);
	}
}










//Assignment - 15 : 22nd Nov'2024 [30-35 mins]
//On user defined range print first 3 numbers which is divisible by 3 & 4.

//Hint : pass start and end index as a parameter.




