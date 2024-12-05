package pratik;

public class Assignment19 {
	void charrev(String str) {
		for (int a = str.length() - 1; a >= 0; a--) {
			System.out.println(str.charAt(a));
		}
	}

	public static void main(String[] args) {
		Assignment19 a = new Assignment19();
		a.charrev("te ch3no");

	}

}
