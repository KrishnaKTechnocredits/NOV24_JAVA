package pratiksha;

public class Assignment18 {
	/*On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
	 *  */
	
	int getLastDivNumber(int startRange, int endRange) {
		
		for(int num=endRange;num>startRange;num--) {
			
			if(num%5==0) {
				
				return num;
			}
		}
		return 0;
	}
	
	public static void main(String[]args) {
		Assignment18 assign18= new Assignment18();
		int ans = assign18.getLastDivNumber(10,498);
		System.out.println(ans + "is the last number which is div by 5 in the given range.");
	}
}

