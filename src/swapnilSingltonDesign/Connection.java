package swapnilSingltonDesign;

public class Connection {
	
	private static Connection con;
	
	private Connection() {
		//db connect
	}
	static Connection getObject() {
		if(con==null) {
			con=new Connection();
		}
		return con;
	}
	
}
