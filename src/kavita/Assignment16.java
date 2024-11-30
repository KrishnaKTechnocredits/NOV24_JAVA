package kavita;

/*On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.
 * Time:20m */
public class Assignment16 {
	void printNumberDivisible(int startRange,int endRange){
		int sum=0;
		int count=0;
		for(int i=startRange;i<=endRange;i++){
			if(i%5==0 && i%7==0){
				sum=sum+i;
				count++;
				if(count==3){
				break;
				}
			}
		}
		System.out.println("Sum & Average of first 3 numbers which are divisible by 5 & 7 in the range " + startRange
				+ " to " + endRange + " are-");
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum / count);
	}

	public static void main(String[] args){
		Assignment16 assignment16=new Assignment16();
		assignment16.printNumberDivisible(1,210);
	}
}
