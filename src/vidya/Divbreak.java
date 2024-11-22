package vidya;

public class Divbreak {
	
	void processData() {
		int count = 0;
		for(int i= 10;i<=500;i++) {
			if(i%3 == 0 && i%4 == 0) {
				System.out.println(i);
				count++;
				if(count == 3) {
					break;
				}
						}
			}
		//System.out.println(count);
	}
	
	public static void main(String[] a) {
		Divbreak divbreak = new Divbreak();
		divbreak.processData();
	}

}
