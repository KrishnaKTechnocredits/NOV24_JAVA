package Assignment_Array;

public class Assignment47 {

	void display(String[] str) {
		for(int i =0;i<str.length;i++) {
			if(str[i].length()>6) {
				System.out.println(str[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		new Assignment47().display(names);
	}
}
