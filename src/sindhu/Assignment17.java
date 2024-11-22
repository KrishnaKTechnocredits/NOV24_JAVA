package sindhu;

public class Assignment17 {
	int count=0;
	void printNum(int endRange, int startRange) {
		for(int num=endRange; num>=startRange; num--){
			if(num%5==0){
				System.out.println(num);
				count++;
				
				if(count==5){
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println("Last 5 numbers divisible by 5 in given range: ");
		Assignment17 assign17 = new Assignment17();
		assign17.printNum(500,10);
	}
}
