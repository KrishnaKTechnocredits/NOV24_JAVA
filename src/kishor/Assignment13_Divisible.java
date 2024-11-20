package kishor;

public class Assignment13_Divisible {
	void divisibleNumber(int startrange,int endrange) {
		for(int i=startrange;i<=endrange;i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("Divisible by 5 & 3, numbers are "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment13_Divisible divisible = new Assignment13_Divisible();
		divisible.divisibleNumber(5, 40);
	}
}
