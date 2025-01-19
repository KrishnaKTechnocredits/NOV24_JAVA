package swapnil;

public class Assignment45 {
	
	void pattern(){
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=2;j++) {
				if(j%2!=0) {
					System.out.println("#*#*#");
				}
				else {
					System.out.println("#*#");
				}
			}
		}
	}
		
	

	public static void main(String[] args) {
		Assignment45 a = new Assignment45();
		a.pattern();

	}

}

//	for(int i=3;i>=2;i--) {
//		for(int j=1;j<=i;j++) {
//			if(j%2!=0){
//				System.out.println(" #*#*# ");
//			}
//				else {
//					System.out.println(" #*# ");
//				}
//			}
//		
//		}
//	}