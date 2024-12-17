package src;

public class Assignment_47 {

	public static void main(String[] args) {
		Assignment_47 assignment = new Assignment_47();
		assignment.main();
		
	}
	void main() {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for(int i =0;i<names.length;i++) {
			String str = names[i];
			if(str.length()>6) {
				System.out.println(str);
			}
		}
	}

}
