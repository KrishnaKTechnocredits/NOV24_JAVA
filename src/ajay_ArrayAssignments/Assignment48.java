package ajay_ArrayAssignments;

public class Assignment48 {
	
	void getcountofpositiveno(int[] input) {
		int count=0;
		System.out.println("Count of Positive Numbers in given array is : ");
		for(int i=0;i<input.length;i++) {
			
			if (input[i]>0) {
				
				count++;
			}
		}System.out.println(count);
		
	}

	public static void main(String[] args) {
		Assignment48 assignment48=new Assignment48();
		int[] input={10,30,-45,66,-10};
		assignment48.getcountofpositiveno(input);
	
	}

}
