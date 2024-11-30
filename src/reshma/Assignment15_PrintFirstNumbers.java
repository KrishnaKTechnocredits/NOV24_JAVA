package reshma;

public class Assignment15_PrintFirstNumbers {
	void printFirstNumber(int startindex,int endindex){
		System.out.println("First 3 numbers divisible by 3 and 4 are :");
		int count=0;
		for(int num=startindex;num<=endindex;num++) {
			if(num%3==0 && num%4==0) {
				System.out.println(num);
				count++;
				if(count==3) {
					break;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Assignment15_PrintFirstNumbers p=new Assignment15_PrintFirstNumbers();
		p.printFirstNumber(10,500);
	}
}
