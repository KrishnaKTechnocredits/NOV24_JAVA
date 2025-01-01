package roshan.array;
import java.util.Arrays; 

public class ReverseEachStringAndReverseArray {
	String getreverseString (String input) {
		String str = "" ;
		for (int i=input.length()-1;i>=0;i--) {
			str += input.charAt(i);
		}
		
		return str;
	
	}
	String [] getRevArray (String [] input) {  //always remember to add string bracket
		String [] output = new String [input.length];
		for(int i=input.length-1 ,j=0;i>=0;i--,j++) {   //declare loop carefully 
			output[j]=getreverseString(input[i]);
		}
		return output;
	}
	public static void main (String [] args) {
		String [] input ={"tech", "aashvi", "Credits", "Ansh"};
		ReverseEachStringAndReverseArray reverseeachstringandreversearray = new ReverseEachStringAndReverseArray ();
		String [] result = reverseeachstringandreversearray.getRevArray (input);
		System.out.println(Arrays.toString(result));
		
	}

}



/*
 * Assignment - 62 : 22nd Dec'2024 [20 min] [IMP] reverse each string in array
 * and place at in reverse order.
 * 
 * input : {"tech", "aashvi", "Credits", "Ansh"} output : [hsnA,stiderC, ivhsaa,
 * hAssignment -
 */


