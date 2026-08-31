package prem;

public class Assignment98 {
	
		 private static Assignment98 assignment98;
		 private Assignment98() {
			 
		 }
			 public static Assignment98 getConnection() {
					
					if(assignment98==null) {
						assignment98 =new Assignment98 ();
					}
					return assignment98;
			
		}

}
