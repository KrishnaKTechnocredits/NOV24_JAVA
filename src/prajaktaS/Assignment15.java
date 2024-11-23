package prajaktaS;
 
public class Assignment15 {

	void top3Print(int startRange,int endRange) {
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 are :");
		for (int num=startRange;num<=endRange;num++) {
			if (num%3==0 && num%4==0)
			{
				System.out.println(num);
				count++;
			}
			if(count==3){
				break;
				
			}
		}
	}
	
	public static void main(String[] args) {

		Assignment15 assignmnet15=new Assignment15();
		assignmnet15.top3Print(10, 300);
	}

}
