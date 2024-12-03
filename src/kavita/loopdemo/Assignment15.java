package kavita.loopdemo;

/*On user defined range print first 3 numbers which is divisible by 3 & 4.
 * Time: 20m*/

public class Assignment15 {
	void printNumbersdivisible(int startRange,int endRange){
		int count=0;
		System.out.println("First 3 numbers which are divisible by 3 & 4 in the range " + startRange + " to "
				+ endRange + " are-");
		for(int i=startRange;i<=endRange;i++){
			if(i%3==0&& i%4==0){
				System.out.println(i);
				count++;
				if(count==3){
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.printNumbersdivisible(10, 500);
	}
}
