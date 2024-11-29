package mousumi.AssignmentsInLoop;
/**
 Assignment - 18 : 23rd Nov'2024 [20 mins]
 
On user defined range print return the last numbers which is divisible by 5 and print
 the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is divisible by 5 in the given range.

 */

public class LastNumAssignment18  {

	int getLastDivNumber(int startIndex,int endIndex) {
		
		for(int num=startIndex;num>=endIndex;num--) 
			if (num%5==0) {
				System.out.println(num+" is the last number which is "
						                      + " div by 5 in the given range.");
				return num;
			}
		return 10;
	}

	public static void main(String[] args) {
		LastNumAssignment18 Assign18 = new LastNumAssignment18();
		int ans=Assign18.getLastDivNumber(498,10);
		System.out.println("Return- "+ans);
	}

}
