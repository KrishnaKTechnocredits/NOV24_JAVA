package vidya_pattern;

public class Assignment40 {void displayPattern()
{
	for(int i =1;i<=4;i++) {
		for(int j = 1;j<=i;j++) {
			System.out.print((i=i+1) +" ");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Assignment40 ass40 = new Assignment40();
	ass40.displayPattern();
	
}


}
