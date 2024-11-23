package kishor;

public class Assignment18_Return {
	
	int getDivNumber(int startRange, int endRange) {
		for(int i=endRange; i>=startRange;i--) {
			if(i%5==0) {
				return i;
			}
		}
		return 0;	
	}
	
	public static void main(String[] args) {
		Assignment18_Return assignment18 = new Assignment18_Return();
		int ans=assignment18.getDivNumber(10,498);
		if(ans==0 || ans<0) {
			System.out.println("the number is not divisible by 5");
		}
		else {
			System.out.println("The last number which is divisible by 5 is:- "+ ans);
		}
	}
}