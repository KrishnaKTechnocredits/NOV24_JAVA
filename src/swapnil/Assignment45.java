package swapnil;

public class Assignment45 {
	
	void pattern(){
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j%2!=0){
					System.out.print(" # ");
				}
					else {
						System.out.print(" * ");
					}
				}
			System.out.println();
			}
		}
	

	public static void main(String[] args) {
		Assignment45 a = new Assignment45();
		a.pattern();

	}

}
