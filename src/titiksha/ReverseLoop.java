package titiksha;

public class ReverseLoop {
	int reverseof5;
	void divisibleOf5(int startrange,int endrange) {
		System.out.println("Number divible by 5 are : ");
		for(int value=startrange;value<=endrange;value++) {
			if(value%startrange==0) {
				System.out.println(value);}
		}
		
		System.out.println();
	}
	
	void reverseLoop(int endrange,int startrange) {
		System.out.println("Number divisible by 5 in reverse oreder are :");	
		for(int value=endrange;value>=startrange;value--) {
			if(value%startrange==0) {
				System.out.println(value);
			}
		}
	}
	
	public static void main(String[] args) {
		ReverseLoop reverseloop=new ReverseLoop();
		reverseloop.divisibleOf5(5,100);
		reverseloop.reverseLoop(100,5);
	}
}
