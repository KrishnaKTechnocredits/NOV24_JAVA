package vidya_pattern;

public class Assignment39 {
	void displayPattern()
	{
		for(int i =1;i<=4;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment39 ass39 = new Assignment39();
		ass39.displayPattern();
		
	}

}
