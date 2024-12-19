package nilam.Array;

public class Assignment46 {
	
	 void printCharOfName(String name[]) {
		 
		 for(int index=0;index<name.length;index++) {
			 int ch=name[index].length()/2;
			 
			 if(name[index].length()%2==0) {
				 ch--;
				 System.out.println("Middle character of name "+name[index] + "-->" + name[index].charAt(ch));
			 }else {		
				 System.out.println("Middle character of name "+name[index] + "-->" + name[index].charAt(ch));
			 }
		 }
	 }
	 
	 public static void main(String[] args) {
		 Assignment46 assignment46=new Assignment46();
		 String[] name= {"Rohan","Premlata","Anuja","Fazrana"};
		 assignment46.printCharOfName(name);
	}

}
