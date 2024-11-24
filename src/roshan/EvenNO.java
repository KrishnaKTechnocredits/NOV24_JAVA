package roshan;

public class EvenNO {
	
	static void eve (int startRange ,int endRange) {
	    for(int num =startRange; num<=endRange ;num++)
		if (num %2==0) {
			System.out.println("Even number from" + " " + startRange +" "+ "to" + " " + endRange +" " + "is \n" + num);
		}
	}
	public static void main(String[] args) {
		eve(1,100);
	}

}
