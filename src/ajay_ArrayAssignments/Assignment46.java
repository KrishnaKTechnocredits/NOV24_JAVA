package ajay_ArrayAssignments;

public class Assignment46 {

	void getMiddileOfString(String[] input) {
		System.out.println("Middle Character of each String in given array is : ");
		
		for (int i = 0; i < input.length; i++) {//For Even Length String
			
			int index = input[i].length() / 2;
			
			if(input[i].length()%2==0) {
	
			System.out.println(input[i] + "-> "+input[i].charAt(index-1)+ input[i].charAt(index));
			}
			else {//For Odd Length String
				System.out.println(input[i] + "-> "+ input[i].charAt(index));
			}
		}

	}

	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] input = { "Rohan", "Premlata", "Anuja", "Fazrana","Ajay","Maulik" };
		assignment46.getMiddileOfString(input);
	}

}
