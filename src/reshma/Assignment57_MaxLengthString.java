package reshma;
//Return the maximum length string from given array.

//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}

public class Assignment57_MaxLengthString {
	String MaxLengthString(String[] arr){
	    int MaxLength=0;
	    String MaxLengthString="";
	    for(int index=0;index< arr.length;index++){
	      if(arr[index].length()> MaxLength){
	        MaxLengthString= arr[index];
	         MaxLength= arr[index].length();
	      }
	    }
	    return MaxLengthString;
	  }
	  
	  public static void main (String[] args){
		Assignment57_MaxLengthString a57=new Assignment57_MaxLengthString();
	    String [] arr= {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
	    String str=a57.MaxLengthString(arr);
	    System.out.println(str);
	  }
}
