package prajaktaS;

public class Assignment16 {
	
	void top3Print(int startRange,int endRange) {
		int count=0;
		int sum=0;
		int average=0;
		int num=0;
		System.out.println("First 3 numbers divisible by 5 and 7 are :");
		for (num=startRange;num<=endRange;num++) {
			if (num%5==0 && num%7==0)
			{
				System.out.println(num);
				sum=sum+num;
				average=sum/3;
				count++;
			}
			if(count==3){
				
				break;
			}
			
		}
		System.out.println("Found "+ count+" numbers which are divible by 5 & 7");
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+average);
					
	}
	public static void main(String[] args) {

		Assignment16 assignmnet16=new Assignment16();
		assignmnet16.top3Print(1,210);
	}

}
