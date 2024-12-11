package pratiksha;

public class Assignment13_ToPrintNumdivisibleBy5And4 {

	void getNumDivBy5And3(int startRange, int endRange) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		
		for(int num=startRange; num<=endRange; num++) {
			
			if (num% 5== 0 && num% 3==0) {
				
				int divNum = num;
				System.out.println(divNum);
			}
		}
	}
	public static void main(String[] args) {
		 
		Assignment13_ToPrintNumdivisibleBy5And4 assi13=new  Assignment13_ToPrintNumdivisibleBy5And4();
		
		 assi13.getNumDivBy5And3(5,40);
	}
}
