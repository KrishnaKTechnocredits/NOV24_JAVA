package technocredits;

public class Example6 {
	
	void m1(int num) {
		if(num == 10) {
			System.out.println("Hi");
		}else if (num >8) {
			System.out.println("Hello");
		}else {
			System.out.println("Techno");
		}
	}
	
	void m2(int num) {
		if(num == 10) {
			System.out.println("Hi");
		}
		
		if (num >10) {
			System.out.println("Hello");
		}else {
			System.out.println("Techno");
		}
	}
	
	void m3(int score) {
		if(score >= 50) {
			System.out.println("Wohooo .. you are pass");
		}
		
		
		if(score>=90) {
			System.out.println("A+");
		}else if(score>=80) {
			System.out.println("A");
		}else if(score>=70) {
			System.out.println("B+");
		}
	}
	
	public static void main(String[] args) {
		Example6 example6 = new Example6();
		example6.m3(76);
	}
}
