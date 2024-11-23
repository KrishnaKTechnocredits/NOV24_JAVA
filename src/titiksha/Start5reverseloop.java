//Assignment - 17 : 22nd Nov'2024 [20 mins]
//On user defined range print last 5 numbers which is divisible by 5.
//Hint : pass start and end index as a parameter.
//Input : Range -> 10 to 500
//Output : Last 5 numbers divisible by 5 is :
//500
//495
//490
//485
//480

package titiksha;

public class Start5reverseloop {
	int count;
	void last5Numbers(int startrange,int endrange) {
		System.out.println("The last 5 numbers divible by 5 in reverse order are");
		for(int num=endrange;num>=startrange;num--) {
			if(num%5==0) {
				if(count<5) {
				count++;
				System.out.println(num);}
			}
		}
	}
	public static void main(String[] args) {
		Start5reverseloop start5reverseloop=new Start5reverseloop();
		start5reverseloop.last5Numbers(10,500);
	}
}
