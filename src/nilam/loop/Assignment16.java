package nilam.loop;

public class Assignment16 {
	void sumOfNume(int startNum, int endNum) {
		int avg=0, sum=0, count=0;
		System.out.println("Numbers are:");
		for(int start=startNum;start<=endNum;start++) {
			if(start%5==0 && start%7==0) {
				System.out.println(start);
				sum=sum+start;
				count++;
			}
		}
		
		avg=sum/count;
		System.out.println("Found "+count+" numbers which are divisible by 5 and 7");
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+avg);	
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16=new Assignment16();
		assignment16.sumOfNume(1, 110);
	}
}
