package kavita;

/* Assignment17:On user defined range print last 5 numbers which is
 * divisible by 5.
 * Time:13m */

public class Assignment17 {
	
	void printLast5NumberDivisible(int startRange,int endRange){
		int count=0;
		
		for(;endRange>=startRange;endRange--){
			if (endRange%5 == 0){
				System.out.println(endRange);
				count++;
				if(count==5){
					break;
				}
			}
		}
		
		//System.out.println("The last 5 numbers divisible by 5 in the range " + startRange + " to " + endRange + " are:");
	}
	
	public static void main(String[] args){
		Assignment17 assignment17=new Assignment17();
		assignment17.printLast5NumberDivisible(10,500);
	}
}
