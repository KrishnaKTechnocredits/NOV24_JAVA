package ashwini.stringAssignments;

public class StringRevOrderAssignment19 {
	void StringRevOrder(String str) {
		for(int input=str.length()-1;input>=0;input--) {
			System.out.println(str.charAt(input));
		}
	}
	public static void main(String[] args) {
		StringRevOrderAssignment19 assign19=new StringRevOrderAssignment19();
		assign19.StringRevOrder("te ch3no");
	}

}
