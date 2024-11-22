package ashwini;
	
public class RevOrderAssignment17 {
	void revOrder(int endRange,int startRange) {
		int count=0;
		System.out.println("Last 5 number divisible by 5 is: ");
		for(int num=endRange;num>=startRange;num--) {
			if(num%5==0) {
				System.out.println(num);
				count++;
				if(count==5) {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		RevOrderAssignment17 assn17=new RevOrderAssignment17();
		assn17.revOrder(500, 10);
	}

}
