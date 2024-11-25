package rushikesh.StringDemoAssignment;

public class Assignment_19 {
	
	void printCharMethod(String str) {
		int i=str.length();
		System.out.println("Length of Index is "+i);
		System.out.println("characters of given string in reverse order is");
		for(int index=i-1;index<i;index--) {
				System.out.println(str.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19 assignment_19=new Assignment_19();
		assignment_19.printCharMethod("technocredit");
	}
}
