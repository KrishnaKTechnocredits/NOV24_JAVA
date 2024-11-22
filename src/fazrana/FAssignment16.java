package fazrana;

public class FAssignment16 {
	
	void sumAverage(int start, int end) {
		int sum=0;
		int count=0;
		System.out.println("Numbers divisible by 5&7-");
		for (;start<=end;start++) {
			if (start%5==0 &&start%7==0) {
				System.out.println(start);
				sum=sum+start;
				count++;
				if (count==3) {
					break;
				}
			}
		}
		System.out.println("Found "+count+" number which are divisible by 5&7");
		System.out.println("total sum of "+count+" numbers is "+sum);
		int average= (sum/count);
		System.out.println("Average of numbers is "+average);
	}
	
	public static void main(String[] args) {
		FAssignment16 fassignment16=new FAssignment16();
		fassignment16.sumAverage(1, 210);
	}
}
