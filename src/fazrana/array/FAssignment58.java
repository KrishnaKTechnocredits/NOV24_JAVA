//Assignment - 58 : 21th Dec'2024 [15 mins]
//Return the second maximum length string from given array.
//If you find multiple string as second maximum, return the last second maximum.
//
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : PuGlobantne

package fazrana.array;

public class FAssignment58 {
	String getSecondMaxString(String[] array) {
		String maxString=array[0];
		String SecondMaxString=array[1];
		
		if(array[0].length()<array[1].length()) {
			SecondMaxString=maxString;
			maxString=array[1];
		}
		System.out.print("Input Array: {"+ array[0]+","+ array[1]);
		for (int i=2; i< array.length;i++) {
			System.out.print(array[i]+",");
			if(maxString.length()<array[i].length()) {
				SecondMaxString=maxString;
				maxString=array[i];
			}else if(SecondMaxString.length()<array[i].length()){
				SecondMaxString=array[i];
			}
		}System.out.println("}");
		return ("Second Max String: "+SecondMaxString);
	}
	
	public static void main(String[] args) {
		String[] array= {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		FAssignment58 fassignment58=new FAssignment58();
		System.out.println(fassignment58.getSecondMaxString(array));
		
	}

}
