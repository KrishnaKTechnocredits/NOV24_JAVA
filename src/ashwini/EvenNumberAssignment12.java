package ashwini;

public class EvenNumberAssignment12 {
	void printEvenNum(int startRange, int endRange){
		System.out.println("Even Numbers are ");
			for(int num=startRange; num<=endRange; num++){
				if(num%2==0) {
					System.out.println(num);
				}
			}
		}
	public static void main(String[] args) {
		EvenNumberAssignment12 assignment12=new EvenNumberAssignment12();
		assignment12.printEvenNum(10, 15);
	}
}
