package roshan;

public class LastFiveNum {
	
	static void lfive (int startRange, int endRange){
		int count=0;
		for(int num = endRange; num>= startRange;num-- ) {
			if(num%5==0) {
				System.out.println("Last five no which is divisabele by 5 is"+" "+num);

			count ++ ;
				if(count ==5) {
				break;	
				}

			}
			

		}

	}
	
public static void main(String[] args) {
		
		LastFiveNum.lfive (1,100);
	}
}































//On user defined range print last 5 numbers which is divisible by 5.