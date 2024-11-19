package technocredits;

public class Example7 {
	
	void processData(int num) {
		if(num>35) {
			System.out.println(1);
		}else if(num > 50) {
			System.out.println(2);
		}else if(num > 75) {
			System.out.println(3);
		}else if(num > 90) {
			System.out.println(4);
		}
	}
	
	void start(String browser) {
		if(browser.equals("chrome")) {
			
		}else if(browser.equals("safari")) {
			
		}else if(browser.equals("edge")) {
			
		}else {
			System.out.println("WE are not supporting given browser...");
		}
	}
	
	void processData1(int num) {
		if(num>35) {
			System.out.println(1);
		}
		
		if(num > 50) {
			System.out.println(2);
		}
		
		if(num > 75) {
			System.out.println(3);
		}
		
		if(num > 90) {
			System.out.println(4);
		}
	}
	
	
	public static void main(String[] args) {
		Example7 example7 = new Example7();
		example7.processData1(148);
	}
}
