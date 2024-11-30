/*Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
 */
package nitesh;

public class LastNumberDiv {
	int count;
	static int end;
	static int start;
	void lastNumberDivFive(int startvalue, int endvalue){
		start = startvalue;
		end =endvalue;
		for(;end>=start;end--) {
			if(end%5==0)
			count++;
			if(count==1) {
				break;
			} 
		}		
	}
	public static void main(String[] args) {
		LastNumberDiv lastnumberdiv = new LastNumberDiv();
		lastnumberdiv.lastNumberDivFive(10, 498);
		System.out.println(end+" "+"is the last number which is div by 5 in the given range.");
	}
}
