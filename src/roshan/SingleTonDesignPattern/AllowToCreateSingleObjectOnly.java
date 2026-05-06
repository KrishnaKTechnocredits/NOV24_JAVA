package roshan.SingleTonDesignPattern;

public class AllowToCreateSingleObjectOnly {
	private  static AllowToCreateSingleObjectOnly obj;
	
	private AllowToCreateSingleObjectOnly() {
		
	}
	
	static AllowToCreateSingleObjectOnly m1() {
	if (obj== null) {
		obj = new AllowToCreateSingleObjectOnly ();
	}
	return obj;
	}	
	

}

/*
 * Assignment - 98 : 30th Jan'2025 Create a class called Connection and apply
 * singleton design pattern
 */