package roshan;

public class TwoDivisable {
	
		
		static void TowD (int startRange ,int endRange) {
		    for(int num =startRange; num<=endRange ;num++)
			if (num%3==0 && num%5==0) {
				System.out.println("Even number which is divisable by 3 & 5 is \n" +  num );
			}
		}
		public static void main(String[] args) {
			TowD(1,100);
		}

}
