package ravindra;

public class Connection {
	private static Connection dbconnection;

	private Connection() {

	}

	public static Connection getObject() {
		if (dbconnection == null) {
			dbconnection = new Connection();
		}
		return dbconnection;
	}
}
