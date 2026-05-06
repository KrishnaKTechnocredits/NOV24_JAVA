package anuja.singletone;

//required constructor, private referance variable, method to return a object if not crearted.
public class Assignment98 {
	
	 private static Assignment98 obj ;//2nd steps , create one referance variable and make it private
	//3rd step to create method returtn a object
	 public static Assignment98 returnObject(){
		//if object is created then do not create A new onr
		if(obj==null) {
			obj =new Assignment98 ();
		}
		return obj;
	}
	
	 //1st step create a a constructor as private.
	
	private  Assignment98() {
		
	}
	
	
}	
