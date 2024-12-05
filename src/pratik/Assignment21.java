package pratik;

public class Assignment21 {
	int count = 0;

	void lenstr(String str) {
		for (int num = 0; num <= str.length() - 1; num++) {
			if (str.charAt(num) != ' ') {
				count++;
			}
		}
		System.out.print("length without space is " + count);
		System.out.print(" and space characters are " + (str.length() - count));
	}

	public static void main(String[] args) {
		Assignment21 a = new Assignment21();
		a.lenstr("prem lata gupta");

	}

}
