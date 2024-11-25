package titiksha;



public class Start3Num {
	int num=1;
	int count;
	void whileLoop() {
		while(count < 3) {
			if(num%3==0 && num%7==0) {
				System.out.println("The starting 3 numbers divible by 3 and 7 are :" + num);
				count++;
			}
				num++;
		     }
	 }
	
	

	public static void main(String[] args) {
		Start3Num start3num =new Start3Num();
		start3num.whileLoop();
	}
}
