package kavita;

/*Assignment 18: On user defined range print return the last numbers
 * which is divisible by 5 and print the answer in main method*Time:17m*/

public class Assignment18 {
		int getLastNumberDivisible(int startRange,int endRange){
			for(;endRange>=startRange;endRange--){
				if(endRange%5==0){
				break;
				}
			}
			return endRange;
		}
		public static void main(String[]args){
			Assignment18 assignment18=new Assignment18();
			int ans = assignment18.getLastNumberDivisible(10, 498);
			System.out.println(ans + " is the last number which is divisible by 5 in the given range.");
				}
		} 

