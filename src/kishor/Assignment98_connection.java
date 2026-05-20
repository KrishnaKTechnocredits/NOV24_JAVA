package kishor;
//apply singleton rule-lazy initilization

public class Assignment98_connection {
	
	private static Assignment98_connection connection;
	
	private Assignment98_connection(){
		//code for connection
	}
	
	public static Assignment98_connection getConnectionobject() {
		
		if(connection==null) {
			connection=new Assignment98_connection();
		}
		return connection;
	}
}
