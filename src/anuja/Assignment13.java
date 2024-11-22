package anuja;
/**On user defined range print all numbers which 
 * are divisible by 5 and 3
 */
public class Assignment13 {
	
	//method to devide by 3 and 5
	void printAllNumDivisibleBy3And5(int startNum , int endNum) {
		System.out.println("Below are the numbers which are devisaible by "+startNum+ " and " +endNum+ " . \n ");
		
		for(;startNum<=endNum;startNum++) {
			
			//add condition to check fi the num is devisable 3 and 5 both.
			if(startNum % 3 ==0 && startNum % 5==0) {
				System.out.println(startNum + " \n"); 
			}
		}	
	}
	
	public static void main(String[] args) {
		Assignment13 assignment12 = new Assignment13();
		assignment12.printAllNumDivisibleBy3And5(5, 40); //
	}
	

}
