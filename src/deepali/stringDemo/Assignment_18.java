package deepali.stringDemo;
/*Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
*/
public class Assignment_18 {
	int count=0;
	void getLastDivNumber(int startIndex,int endIndex){
		for(int i=endIndex;i>=startIndex;i--) {
			if(i%5==0) {
				count++;
				if(count==1) {
					System.out.println("Last number which is divisible by 5 is : "+ i);
				}	
			}
		}
	}
	
	public static void main(String [] args) {
		Assignment_18 assignment = new Assignment_18();
		assignment.getLastDivNumber(10,498);
	}
}
