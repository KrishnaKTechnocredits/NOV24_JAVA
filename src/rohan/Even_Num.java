package rohan;

public class Even_Num {
	
	public static void main(String[] args) {
		Even_Num num = new Even_Num();
		num.EvenNum(10,15);
		num.EvenNumber(20, 25);
	}
	
	void EvenNum(int StartRange, int EndRange) {
		System.out.println("Even number are:");
		for(int i=StartRange ;i<=EndRange ; i++) {
			if(i%2==0) 
			{
				System.out.println(i);
			}
		}
	}
	void EvenNumber(int StartRange, int EndRange) {
		System.out.println("Modified method of Even number are:");
		for(;StartRange<=EndRange ; StartRange++) {
			if(StartRange%2==0) 
			{
				System.out.println(StartRange);
			}
		}
	}

}
