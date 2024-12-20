package rohan;

public class Assignment_48 {

	public static void main(String[] args) {
		Assignment_48 assignment = new Assignment_48();
		int a = assignment.main();
		System.out.println("output = "+a);
	}
	int main() {
		int[] input = {10,30,-45,66,-10};
		int count =0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>0) {
				count++;
			}
		}
		return count;
	}

}
