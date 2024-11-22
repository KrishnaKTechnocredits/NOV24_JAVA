package fazrana;

public class FAssignment17 {
	
	void lastNumber(int start, int end) {
		int count=0;
		System.out.println("Last 5 numbers divisible by 5 are -");
		for (;end>=start;end--) {
			if (end%5==0) {
				System.out.println(end);
				count++;
				if (count==5) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FAssignment17 fassignment17=new FAssignment17();
		fassignment17.lastNumber(10, 500);
	}
}
