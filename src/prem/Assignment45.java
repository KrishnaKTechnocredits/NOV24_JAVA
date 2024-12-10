package prem;

public class Assignment45 {
	
	void pattern() {
		for (int i =1; i<=4;i++){
			if(i%2==0) {
				System.out.println("#*#");
			}else {
				System.out.println("#*#*#");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Assignment45 assign45 =new Assignment45();
		assign45.pattern();
	}
}
