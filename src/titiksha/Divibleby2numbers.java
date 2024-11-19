package titiksha;

public class Divibleby2numbers {
	
		void divisibleOf3and7(int num ,int num1,int num2) {
			System.out.println("Number divible by 3 and 7 are : ");
			for(int value=num;value<=100;value++) {
				if(value%num1==0 && value%num2==0) {
					System.out.println(value);}
			}
		}

		public static void main(String[] args) {
			Divibleby2numbers divisibleloop=new Divibleby2numbers();
			divisibleloop.divisibleOf3and7(1,3,7);
		
		}
	

}
