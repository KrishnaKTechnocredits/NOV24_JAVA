package reshma;
/* Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};*/

public class Assignment46_PrintMiddleChar {
	void printMiddleChar(String[] input){
	    for(int i=0;i<input.length;i++){
	      String str= input[i];
	      if(str.length()%2!=0){
	        int c= str.length()/2;
	        System.out.println(str+" -> "+str.charAt(c)); 
	      }else{	         
				int c = str.length()/2-1;					
				System.out.println(str+" -> "+str.charAt(c)); 
	      }
	    }
	  }
	  
	  public static void main (String[] args){
		  Assignment46_PrintMiddleChar m=new Assignment46_PrintMiddleChar();
	    String []input= {"Rohan", "Premlata", "Anuja", "Fazrana"};
	    m.printMiddleChar(input);
	    
	  }
}
