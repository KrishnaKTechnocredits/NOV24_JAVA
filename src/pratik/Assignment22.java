package pratik;

public class Assignment22 {
	int count;
	int count1;

	int getdigit(String str) {
		for (int num = 0; num < str.length(); num++) {
			boolean flag = Character.isDigit(str.charAt(num));
			if (flag == true) {
				count++;
			}
		}

		return (count);
	}

	int getletter(String str) {
		for (int num = 0; num < str.length(); num++) {
			if (Character.isLetter(str.charAt(num))) {
				count1++;
			}
		}
		return (count1);
	}

	public static void main(String[] args) {
		Assignment22 a = new Assignment22();
		a.getdigit("aa1kan33ks4h5a");
		a.getletter("aa1kan33ks4h5a");
		System.out.println("Total " + a.count + " digits are there in given input.");
		System.out.println("Total " + a.count1 + " letter are there in given input.");

	}

}
