package siddharth;

public class Assingment98LazySingletonConnection {
	
	private static Assingment98LazySingletonConnection lazy; //Private static ref variable
		
	private Assingment98LazySingletonConnection() { //Private Constructor
	}
	
	public static Assingment98LazySingletonConnection getObject() { //Public Global access method
		if(Assingment98LazySingletonConnection.lazy==null) { //Lazy init
			Assingment98LazySingletonConnection lazy = new Assingment98LazySingletonConnection();
		}
		return lazy;
	}
}
