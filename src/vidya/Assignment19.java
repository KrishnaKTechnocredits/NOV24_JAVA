package vidya;

public class Assignment19 {
	void printDataInRevOrder(String name) {
		for(int index=name.length()-1;index>=1;index--) {
			System.out.println(name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.printDataInRevOrder("te ch3no");
	}
}
