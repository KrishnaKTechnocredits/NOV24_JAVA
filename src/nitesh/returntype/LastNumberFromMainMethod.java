/*Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
 */
package nitesh.returntype;

class LastNumberFromMainMethod{
	int count;
	static int end;
	static int start;

	int getLastDivNumber(int startIndex,int endIndex){
		end = endIndex;
		start =startIndex;
		for(;end>=start;end--){
			if(end%5 ==0){
				count++;
				if(count==1){
					break;
				}
			}
		}return endIndex;
	}
	public static void main(String[] args){
		LastNumberFromMainMethod lastnumberfrommainmethod = new LastNumberFromMainMethod();
		lastnumberfrommainmethod.getLastDivNumber(10,498);
		System.out.println(end+ " is the last number which is div by 5 in the given range.");
	}
}