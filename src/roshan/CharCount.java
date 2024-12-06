package roshan;

public class CharCount {
	 static int count=0;        //count was declared in loop

 int striCount (String str, char ch){
	 for(int index=0 ;index <str.length();index++) {
		 if(str.charAt (index)== ch) {
			count++ ;
		  
		 }
	 }	
	 return count;
	  
 }
 
 public static void main(String[] args) {
	CharCount charcount = new CharCount () ;
	charcount.striCount("RoshanMokati" ,'a');
	System.out.println("The character 'a' appears " + count + " times.");
}

}