package pranita;


public class Assignment58 {
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
		Assignment58 assignment58=new Assignment58();
		System.out.println(assignment58.getSecondMaxString(array));
		
	}

}
