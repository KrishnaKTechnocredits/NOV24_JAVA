package nitish;

public class Divisible {
	
	void divisible5(int start,int end) {
		for(int num = start;num<=end;num++) {
			if(num%5==0 && num %3==0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Divisible divisible = new Divisible();
		System.out.println("The numbers which are divisible by 5 and 3 are ");
		divisible.divisible5(5, 40);
	}

}
