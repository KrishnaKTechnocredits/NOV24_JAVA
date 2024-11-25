package pranita;

public class Assignment_20 {
	 
	int getCharFreq(String str, char ch){
		
		int count=0;
	    for (int index=0;index<str.length();index++) {
	    
	    	if(str.charAt(index)=='a'){
	    		count++;
	    	 	} 
	    	}
		 
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Count of a in aakanskha is  "+new Assignment_20().getCharFreq("aakanskha", 'a'));
	}

}

 
   
   
   
   
   
   
   
   
   
   


   
   
   
   
   
   
   
   
   
   
    