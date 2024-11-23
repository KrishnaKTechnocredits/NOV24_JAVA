//Assignment - 15 : 22nd Nov'2024 [30-35 mins]
//On user defined range print first 3 numbers which is divisible by 3 & 4.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 500
//Output : First 3 numbers divisible by 3 and 4 is :
//12
//24
//36

package harshada;

public class First3Num {
	int count=0;
	void divisibleBy3and4(int startRng, int endRng) {
		System.out.println("First 3 numbers divisible by 3 and 4 are :");
		for(int index=startRng; index<=endRng; index++) {
			if(index%3==0 && index%4==0) {
				System.out.println(index);
				count++;
				if(count==3)
					break;
			}
		}
	}	
	public static void main(String[] args) {
		First3Num first3Num=new First3Num();
		first3Num.divisibleBy3and4(10, 500);
	}
}
