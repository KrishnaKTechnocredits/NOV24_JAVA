package reshma;

public class Assignment18_printReturnvalue {
	int getLastDivNumber(int endIndex, int startIndex){
		int num = 0;
		int count=0;
		for (int i = endIndex; i >= startIndex; i--) {
			if (i % 5 == 0) {
				count++;
				if(count==1) {
				num = i;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		Assignment18_printReturnvalue assignment_18 = new Assignment18_printReturnvalue();
		int num = assignment_18.getLastDivNumber( 498,10);
		System.out.println(num + " is the last number which is div by 5 in the given range");
	}
}
