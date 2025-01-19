package nitish;

public class LengthMoreThan6 {
	
	void output() {
		String[] names = {"Siraj","Bumrah","Arshdeep","Ravindra"};
		
		System.out.println("The names having more than 6 characters are ");
		for(int i = 0;i<names.length;i++) {
			String names2 = names[i];
			if(names2.length()>6) {
				System.out.println(names2);
			}
		}
	}

	public static void main(String[] args) {
		LengthMoreThan6 obj = new LengthMoreThan6();
		obj.output();

	}

}
