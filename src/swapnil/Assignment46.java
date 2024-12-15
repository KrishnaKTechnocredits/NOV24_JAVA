package swapnil;

public class Assignment46 {
	
public static void main(String[] args) {
		
		String[] names = {"rohan","premlata","anuja","fazrana"};
		//System.out.println(names.length);
		for(int i=0;i<names.length;i++) {
			
			//System.out.println(names[i]+"-"+names[i].length());
			if(names[i].length()%2!=0) {
				int A=(names[i].length())/2;
				char ch =names[i].charAt(A);
			 System.out.println(ch);
			}
			else {
				int B=((names[i].length())/2)-1;
				char E =names[i].charAt(B);
				 System.out.println(E);
			}
		}
	}

}

