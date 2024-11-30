package ashwini.stringAssignments;

public class StringRevOrder_Assignment19 {
	
	void stringRevOrder(String str){
		for(int index=str.length();index >=0;index--) {
			System.out.println(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringRevOrder_Assignment19 assn19=new StringRevOrder_Assignment19();
		assn19.stringRevOrder("te ch3no");

	}

}
