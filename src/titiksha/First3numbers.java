
//Assignment - 15 : 22nd Nov'2024 [30-35 mins]
//On user defined range print first 3 numbers which is divisible by 3 & 4.
//Hint : pass start and end index as a parameter.
//Input : Range -> 10 to 500
//Output : First 3 numbers divisible by 3 and 4 is :
//12
//24
//36
package titiksha;
public class First3numbers {
	int count;
	void first3Number(int startrange ,int lastrange) {
		System.out.println("The starting 3 number divisible by 3 and 4 are:");
		for(int num=startrange;num<=lastrange;num++) {
			if(num%3==0 && num%4==0) {
				if(count<3) {
				count++;
				System.out.println(num);}
			}
		}
	}
	public static void main(String[] args) {
		First3numbers first3number=new First3numbers();
		first3number.first3Number(10,500);
	}
}
