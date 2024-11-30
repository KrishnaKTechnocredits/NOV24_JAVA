package prem;

public class EvenNumber {
	
	void number(int startRange,int endRange) {
		for (int num =startRange; num<= endRange;num++) {
			if (num%2==0){
				System.out.println(num);
		  }
		}
	}
		
	public static void main(String[] args) {
		EvenNumber evenNumber = new EvenNumber();
		evenNumber.number(10,15);
	}
}
