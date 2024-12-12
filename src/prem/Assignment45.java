package prem;

public class Assignment45 {
	
	void pattern() {
		String pattern1 ="#*#";
		String pattern2 ="#*#*#";		
		for (int i =1; i<=4;i++){
			if(i%2==0) {
				System.out.println(pattern1);
			}else {
				System.out.println(pattern2);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Assignment45 assign45 =new Assignment45();
		assign45.pattern();
	}
}
