package ravindra;
//A
//B C
//D E F
//G H I J
public class PrintPaternA_J {
	public static void main(String[] args) {
		char charater='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(charater+" ");
				charater++;
			}
			System.out.println();
		}
	}
}
