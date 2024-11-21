package ashwini;

public class DivBy5and3Assignment13 {
	void Division(int startRange,int endRange) {
		System.out.println(" Divisible by 5 & 3, numbers are:");
		
		for(int num=startRange;num<=endRange;num++) {
			if(num%5==0 && num%3==0) {
				System.out.println(num);
			}
		}		
}
	public static void main(String[] args) {
		DivBy5and3Assignment13 assignment13=new DivBy5and3Assignment13();
		assignment13.Division(5, 40);
	}
}
