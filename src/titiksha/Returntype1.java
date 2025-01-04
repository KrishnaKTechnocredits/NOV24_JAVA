//Assignment - 18 : 23rd Nov'2024 [20 mins]
//On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.
//int getLastDivNumber(int startIndex, int endIndex){}
//Hint : pass start and end index as a parameter.
//Input : Range -> 10 to 498
//Output : 495 is the last number which is div by 5 in the given range.

package titiksha;

public class Returntype {
	static int count;
	static int getLastDivNumber(int startrange,int endrange) {
		for(int num=endrange;num>=endrange;num--) {
			if(num%5==0) {
				if(count<startrange) {
					count++;
				return num;
				}
				}
		}
			return 1;
	}
	
	
	public static void main(String[] args) {
		int lastrange=getLastDivNumber(10,495);
		System.out.println("The Lastnumber divible by 5 in range:" + lastrange);
		
	}

}
