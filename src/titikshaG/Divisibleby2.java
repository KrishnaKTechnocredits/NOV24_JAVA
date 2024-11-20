package titikshaG;

public class Divisibleby2 {
	
	void divisibleOf2(int startrange,int endrange,int num) {
		System.out.println("Number divible by 2 are : ");
		for(int value=startrange;value<=endrange;value++) {
			if(value%num==0) {
				System.out.println(value);}
		}
	}
		
		public static void main(String[] args) {
			Divisibleby2 divisibleby2=new Divisibleby2();
			divisibleby2.divisibleOf2(1,100,2);
			}
	}

