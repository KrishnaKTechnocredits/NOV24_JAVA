package madhura;

public class Assignment15_First3Numbers {
	
	void printNumDivBy3And4(int startRange, int endRange) {
		System.out.println ("The first 3 numbers divisible by 3 and 4 : ");
		int count=0;
		for(int num=startRange; num<=endRange; num++) {
			if(num%3==0 && num%4==0) {
				System.out.println (num);
				count++;
				if (count==3) {
					break;
				}
			}
		}
	}
	
	public static void main (String[] args) {
		Assignment15_First3Numbers printnum = new Assignment15_First3Numbers();
		printnum.printNumDivBy3And4(10,500);
	}
}