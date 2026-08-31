package pranita;

public class Assignment59 {
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
		return SecondMaxString;
	}
	
	void printAllSecondMaxString(String[] array) {
		String SecondMaxString=getSecondMaxString(array);
		System.out.println("Output: ");
		for(int i=0;i<array.length;i++) {
			if (SecondMaxString.length()==array[i].length()) {
				System.out.println(array[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		String[] array= {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment59 fassignment59=new Assignment59();
		fassignment59.printAllSecondMaxString(array);
		
	}
}
