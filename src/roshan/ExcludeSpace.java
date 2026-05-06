package roshan;

public class ExcludeSpace {
	static int a = 0;
	static int b = 0;

	static void getWithoutSapce(String word) {
		for (int index = 1; index <= word.length(); index++) {
			if (word.charAt(index) == ' ') {
				a++;
			} else {
				b++;
			}
		}
	}

	public static void main(String[] args) {
		ExcludeSpace.getWithoutSapce("my name is roshan Mokati");
		System.out.println("total space count is " + a + " " + "total alphabet are " + b);

	}

}

/*
 * Find the length of the given string excluding space. input : prem lata gupta
 * output : length without space is 13 and space characters are 2.
 */