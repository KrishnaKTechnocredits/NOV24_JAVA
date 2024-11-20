package titiksha;

public class Divisibleby5and3 {
	void divisibleOf2(int startrange,int endrange) {
		System.out.println("Number divible by 5 and 3 are : ");
		for(int value=startrange;value<=endrange;value++) {
			if(value%3==0 && value%5==0) {
				System.out.println(value);}
		}
	}
		
		public static void main(String[] args) {
			Divisibleby5and3 divisibleby3and5=new Divisibleby5and3();
			divisibleby3and5.divisibleOf2(1,100);
			}
	}



