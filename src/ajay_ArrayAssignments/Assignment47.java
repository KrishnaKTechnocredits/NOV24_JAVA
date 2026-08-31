package ajay_ArrayAssignments;

public class Assignment47 {

	void getMiddleCharforStringGreaterThan6Char(String[] input) {
		System.out.println("Middle Character for String with length greater than 6 is : ");
		for(int i=0;i<input.length;i++) {
			
			if(input[i].length()>6) {
				
				int index=input[i].length()/2;
				
				char ch=input[i].charAt(index);
				
				System.out.println(input[i] +"->" +ch);
				
			}
			
		}
	}

	public static void main(String[] args) {
		Assignment47 assignment47=new Assignment47();
		String[] input={"Rohan", "Premlata", "Anuja", "Fazrana"};
		assignment47.getMiddleCharforStringGreaterThan6Char(input);

	}

}
