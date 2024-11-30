/*
 Assignment - 16 : 22nd Jun'2024 [25 mins]
On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 210
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70
 */

package nitesh;

public class SumAverageRange {
	
	int countindex;
	int sum;
	int average;
	
	void sumAverage(int startrange,int endrange) {
		for(;startrange<=endrange;startrange++) {
			if (startrange%5==0&&startrange%7==0) {
				System.out.println("Numbers are="+" "+startrange);
					sum = sum+startrange;
					countindex++;
						if(countindex==3) {
						break;
						}
					}
			}
			System.out.println("Found "+" "+countindex+" "+" numbers which are divible by 5 & 7.");
			System.out.println("Sum ="+ " "+sum);
			average= sum/countindex;
			System.out.println("Average ="+ " "+average);
	}
	public static void main(String[] args) {
		SumAverageRange sumaveragerange =new SumAverageRange();
		sumaveragerange.sumAverage(1, 210);
	}
}
