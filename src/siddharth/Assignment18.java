package siddharth;

public class Assignment18 {
	
	int getLastDivNumber(int startIndex, int endIndex){
		System.out.println("Input: Range -> "+startIndex+" to "+endIndex);
		for(int num=endIndex;num>=startIndex;num--){
			if(num%5==0) {
				return num;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		int num = assignment18.getLastDivNumber(10, 498);
		System.out.println(num+" is the last number which is div by 5 in the given range.");
	}
}