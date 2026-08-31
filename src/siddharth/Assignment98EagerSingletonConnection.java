package siddharth;

public class Assignment98EagerSingletonConnection {
	
	private static Assignment98EagerSingletonConnection eager = new Assignment98EagerSingletonConnection(); //ref var already created
	
	private Assignment98EagerSingletonConnection() { //Private Constructor
	}
	
	public static Assignment98EagerSingletonConnection getObject() { 
		return eager;
	}
}

