package vidya;

public class ReverseNumber {
	
	void processData() {
		int count = 0;
		for(int i=500;i>=10;i--) {
			if(i % 5==0)
			{
				System.out.println(i);
				count++;
				if(count == 5) {
					break;
				}
				
			}
			
		}
		System.out.println(count);
	}
	
	public static void main(String[] a) {
		ReverseNumber rn = new ReverseNumber();
		rn.processData();
	}

}
