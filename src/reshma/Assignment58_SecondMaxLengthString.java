package reshma;
/* Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne */

public class Assignment58_SecondMaxLengthString {
	String MaxLengthString(String[] arr){
	    String MaxLengthString="";
	     String SecondMaxLengthString="";
	    for(int index=0;index< arr.length;index++){
	      if(arr[index].length()> MaxLengthString.length()){
	        MaxLengthString= MaxLengthString;
	         MaxLengthString= arr[index];
	      }else{
	      if (arr[index].length()>=SecondMaxLengthString.length()){
	        SecondMaxLengthString=arr[index];
	      	}
	      }
	    }
	    return SecondMaxLengthString;
	  } 
	  
	  public static void main (String[] args){
		Assignment58_SecondMaxLengthString a58=new Assignment58_SecondMaxLengthString();
	    String [] arr= {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
	    String str=a58.MaxLengthString(arr);
	    System.out.println(str);
	  }
}
