package reshma;
/* return the array having elements in reverse order of original array.
 
input : {10,34,22,16,19,99}
 */

public class Assignment54_ReturnRevArray {
	int [] getRevArray(int [] input) {
		 int [] revarray=new int [input.length];	
			for(int i=input.length-1,j=0;i>=0;i--,j++) {
				revarray[j]=input[i];
			}				
			return revarray;
		}

		public static void main(String[] args) {
			Assignment54_ReturnRevArray a54=new Assignment54_ReturnRevArray();
			System.out.println( "The array in reverse order is " );
			int []input = {10,34,22,16,19,99};
			int []Array=a54.getRevArray(input);
			for(int i=0;i<Array.length;i++)
			System.out.println(Array[i]);
			}
}
