package reshma;

public class Assignment18_printReturnvalue {
	static int num;
	int getLastDivNumber (int startRange, int endRange) {
		for(num=endRange;num>=startRange;num--) {
			if(num%5==0) {
			break;
			}
		}
	 return num;	
	}
	public static void main(String[] args) {
		Assignment18_printReturnvalue assignment_18 = new Assignment18_printReturnvalue();
		int num = assignment_18.getLastDivNumber(10, 498);
		System.out.println(num + " is the last number which is div by 5 in the given range");
	}
}
