package siddharth;

public class Assignment98LazySingletonConnection {
	
	private static Assignment98LazySingletonConnection lazy; //Private static ref variable
		
	private Assignment98LazySingletonConnection() { //Private Constructor
	}
	
	public static Assignment98LazySingletonConnection getObject() { //Public Global access method
		if(Assignment98LazySingletonConnection.lazy==null) { //Lazy init
		lazy = new Assignment98LazySingletonConnection();
		}
		return lazy;
	}
}
