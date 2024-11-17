package TechnoCredits;

public class Example4 {
	
	void processData(String name, int rno) {
		if(name.equals("Maulik") && rno == 13) {
			System.out.println("Technocredits");
		}else {
			System.out.println("NOV2024");
			
		}
	}
	
	public static void main(String[] args) {
		Example4 ex4 = new Example4();
		ex4.processData("Maulik", 13);
	}
}
