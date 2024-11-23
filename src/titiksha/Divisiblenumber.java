//Find the first number divisible by given number

package titiksha;

public class Divisiblenumber {

	int divibleNumber(int startrange,int endrange,int fnum) {
		for(int num=startrange;num<=endrange;num++) {
			if(num%fnum==0) {
				return num;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Divisiblenumber divisiblenumber=new Divisiblenumber();
		int num=divisiblenumber.divibleNumber(1,100,2);
		System.out.println("The first number divisible by given number is: "+ num);
		
	}
}
