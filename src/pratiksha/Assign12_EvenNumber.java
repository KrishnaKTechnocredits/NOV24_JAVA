package pratiksha;

public class Assign12_EvenNumber {

	void number(int startRange, int endRange) {
		
		for(int num=startRange; num<=endRange; num++) {
			
			if(num%2 == 0) {
				
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Assign12_EvenNumber assi12 = new Assign12_EvenNumber();
		
		assi12.number(10,15);
	}
}


