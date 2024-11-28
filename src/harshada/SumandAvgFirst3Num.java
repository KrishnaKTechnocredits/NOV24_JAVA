//Assignment - 16 : 22nd Jun'2024 [25 mins]
//On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 1 to 210
//Output : Numbers are,
//35
//70
//105
//Found 3 numbers which are divible by 5 & 7.
//sum = 210
//Average = 70

package harshada;

public class SumandAvgFirst3Num {
	int count=0;
	int sum;
	void divisibleBy5and7(int startRng, int endRng) {
		System.out.println("Numbers divisible by 5 and 7 are :");
		for(int index=startRng; index<=endRng; index++) {
			if(index%5==0 && index%7==0) {
				System.out.println(index);
				sum=sum+index;
				count++;
				if(count==3)
					break;
			}
		}
		System.out.println("Found 3 numbers which are divible by 5 & 7");
		System.out.println("sum = "+sum);
		System.out.println("Average = "+(sum/count));
	}
	public static void main(String[] args) {
		SumandAvgFirst3Num sumandAvgFirst3Num=new SumandAvgFirst3Num();
		sumandAvgFirst3Num.divisibleBy5and7(1, 210);
	}	
}
