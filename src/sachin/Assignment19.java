package sachin;

public class Assignment19 {
	 // int i=0; i<=7 
	
	void getReverse(String st) {
		
	//	String st= name;
	//	String name1="tech3no";
	//int abc	=name1.length(); //6
		for(int index=st.length()-1; index == st.length()-1 ; index--)  {
			
		//	System.out.println("hi");
				
				System.out.println(st.charAt(st.length()-1));
			}
			
		}
	  
	

	public static void main(String[] args ) {
		String st = "tech3no";
		Assignment19 assignment19= new Assignment19();
		assignment19.getReverse(st);

	}

}
