/*
Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.

*/
package pramod;
class Assignment18 {
	
	int getLastDivNumber(int startIndex, int endIndex) {
		for(int index=endIndex; index>= startIndex; index-- ) {
			if(index%5==0) {
				return index;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Assignment18 lastfive = new Assignment18();
		int answer=0;
		answer= lastfive.getLastDivNumber(10,498);
		System.out.println(answer+" is the last number which is div by 5 in the given range.");
	}
}