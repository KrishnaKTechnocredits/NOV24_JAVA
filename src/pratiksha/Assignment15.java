package pratiksha;

public class Assignment15 {

	/*On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36 */
	static int count;
	
	void division(int startRange,int endRange) {
		
		System.out.println("first 3 numbers divisible by 3 and 4 are: ");
		
		for(int num=startRange; num<=endRange; num++) {
			
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
		Assignment15 assignment15=new Assignment15();
		assignment15.division(1, 500);
	}
}
