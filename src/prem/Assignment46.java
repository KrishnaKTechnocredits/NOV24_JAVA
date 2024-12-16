package prem;

public class Assignment46 {

	void printMiddleChar(String[] name) {
		for (int i = 0; i < name.length; i++) {
			int length = name[i].length();
			if (length % 2 == 0) {
				int index = length / 2;
				System.out.println(name[i].charAt(index - 1));
			} else {
				int index1 = (length + 1) / 2;
				System.out.println(name[i].charAt(index1 - 1));
			}
		}
	}

	public static void main(String[] args) {
		String[] name = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		Assignment46 assign46 = new Assignment46();
		assign46.printMiddleChar((name));
	}

}
