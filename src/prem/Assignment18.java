package prem;

public class Assignment18 {
		
	int getLastDivNumber(int startRange,int endRange) {
		for(int num= endRange;num> startRange;num--) {
			if(num%5==0) {
				return num;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Assignment18 assign18 = new Assignment18();
		int ans = assign18.getLastDivNumber(10,498);
		System.out.println(ans + " is the last number which is div by 5 in the given range.");
	}
}
