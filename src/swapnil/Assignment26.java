package swapnil;

public class Assignment26 {
	int sum1,sum2,sum3,sum4;
	void Ascii() {
		int sum=0;
		char ch1 = 'A';
		sum1=sum+ch1;
		char ch2 = 'x';
		sum2=sum+ch2;
		char ch3 = ' ';
		sum3=sum+ch3;
		char ch4 = '.';
		sum4=sum+ch4;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.Ascii();
	}

}
