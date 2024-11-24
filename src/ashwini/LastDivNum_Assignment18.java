package ashwini;

public class LastDivNum_Assignment18 {
	
	int lastDivNum(int startRange,int endRange) {
		int num;
		int count=0;
		for( num=endRange;num>=startRange;num--) {
			if(num%5==0) {
				System.out.println( num+" is the last number  which is div by 5 in the given range.");
				count++;
				if(count==1) {
					break;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		LastDivNum_Assignment18 assn18=new LastDivNum_Assignment18();
		assn18.lastDivNum(10,498);

	}

}
