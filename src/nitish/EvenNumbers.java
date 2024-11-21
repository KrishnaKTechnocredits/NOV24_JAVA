package nitish;

public class EvenNumbers {
	
	 void evenNum(int start,int end) {
		for(int num = start;num<=end;num++) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		System.out.println("Even Numbers are");
		evenNumbers.evenNum(2, 25);

	}

}
