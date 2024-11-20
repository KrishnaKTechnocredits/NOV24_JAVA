package siddharth;

public class Assignment13 {
	
	void divNum(int startRange, int endRange){
		System.out.println("Input: Range -> "+startRange+" to "+endRange);
		System.out.println("Output: Numbers Divisible by 5 & 3 are: ");
		for(int num = startRange;num<=endRange;num++) {
			if(num%5==0 && num%3==0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.divNum(5,40);
	}
}
