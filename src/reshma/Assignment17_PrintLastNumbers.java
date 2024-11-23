package reshma;

public class Assignment17_PrintLastNumbers {
	void printLastNumber(int endindex,int startindex ){
		System.out.println("Last 5 numbers divisible by 5 are :");
		int count=0;
		for(int num=endindex;num>=startindex;num--) {
			if(num%5==0 ) {
				System.out.println(num);
				count++;
				if(count==5) {
					break;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Assignment17_PrintLastNumbers p=new Assignment17_PrintLastNumbers();
		p.printLastNumber(500,10);
	}
}
