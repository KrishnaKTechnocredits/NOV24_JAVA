//Assignment - 16 : 22nd Jun'2024 [25 mins]
//On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.
//Hint : pass start and end index as a parameter.
//Input : Range -> 1 to 210
//Output : Numbers are,
//35
//70
//105
//Found 3 numbers which are divible by 5 & 7.
//sum = 210
//Average = 70

package titiksha;

public class Sumaverage3numbers {
	int sum;
	int average;
	int count;
	void sumAvaerage(int startrange,int endrange) {
		System.out.println("The numbers divisible by 5 and 7 are:");
		for(int num=startrange;num<=endrange;num++) {
			if(num%5==0 && num%7==0) {
				if(count<3) {
					sum = sum+num;
					count++;
					average=sum/count;
					System.out.println(num);}
			}
		}
		System.out.println("The total sum of number are: "+sum);
		System.out.println("The total average of number are: "+average);
	}
		
	public static void main(String[] args) {
		Sumaverage3numbers sumaverage3numbers=new Sumaverage3numbers();
		sumaverage3numbers.sumAvaerage(1,210);
	}
}
