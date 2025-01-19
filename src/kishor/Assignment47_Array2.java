package kishor;

public class Assignment47_Array2 {

	void displayName(String[] name) {
		for (int i = 0; i < name.length; i++) {
			if (name[i].length() > 6) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		Assignment47_Array2 assignment47 = new Assignment47_Array2();
		assignment47.displayName(names);
	}
}
