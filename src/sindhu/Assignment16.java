package sindhu;

public class Assignment16 {
	int sum=0;
	int temp=0;
	int count=0;
	double Avg=0.0;
	
	void printNum(int startRange, int endRange) {
		for(int num=startRange; num<= endRange; num++){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				count++;
				
				temp=sum+num;
				sum=temp;
				if(count==3){
					break;
			    }
			}
		}	
		System.out.println("Sum of these 3 numbers is "+sum);
		Avg = (sum/count);
		System.out.println("Average of these 3 numbers is "+Avg);
	}
	
	
	public static void main(String[] args){
		System.out.println("The first 3 Numbers divisible by 5 and 7 are ");
		Assignment16 assign16 = new Assignment16();
		assign16.printNum(1,210);
	}
}
