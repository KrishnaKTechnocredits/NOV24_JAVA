package sindhu;

public class Assignment15 {
	int count=0;
	void printNum(int startRange, int endRange) {
		for(int num=startRange; num<= endRange; num++){
			if(num%3==0 && num%4==0){
				System.out.println(num);
				count++;
				
				if(count==3){
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println("The first 3 Numbers divisible by 3 and 4 are ");
		Assignment15 assign15 = new Assignment15();
		assign15.printNum(10,500);
	}
}
