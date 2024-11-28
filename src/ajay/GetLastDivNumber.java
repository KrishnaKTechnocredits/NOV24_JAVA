package ajay;

public class GetLastDivNumber {
	
	int getLastNoDivby5(int startIndex, int endIndex){
		int i;
		int count=0;
		for(i=endIndex;i>=startIndex;i--) {
			if(i%5==0) {
				count++;
				if(count==1) {
				System.out.print(+i);
				System.out.print(" is the Last number which is divisible by 5 in the given range");
				}
			}
		}
		
	return i;
	}

	public static void main(String[] args) {
		GetLastDivNumber getlastdivnumber=new GetLastDivNumber();
		getlastdivnumber.getLastNoDivby5(10,498);
	}

}
