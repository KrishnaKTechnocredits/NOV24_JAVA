package prajaktaS.StringDemo;

public class StringLengthExcludeSpace {

	void stringLength(String name)	{
		
		int count=0;int spaces=0;
	    for (int index=0;index<name.length();index++) {
	    
	    	if(name.charAt(index)!=' '){
	    		count++;
	    	}
	    	else {
	    		spaces++;
	    	}
	    				
		}
		System.out.println("length without space is "+count+ " and space characters are "+spaces);
		
	}
	public static void main(String[] args) {
	
		new StringLengthExcludeSpace().stringLength("Prem lata Gupta");
	}

}
