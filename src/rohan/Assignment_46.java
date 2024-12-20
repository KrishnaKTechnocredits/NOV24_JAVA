package rohan;

public class Assignment_46 {

	public static void main(String[] args) {
		Assignment_46 assignment = new Assignment_46();
		assignment.main();
		
	}
	
	void main() {
		String [] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for(int i=0;i<names.length;i++) {
			String str = names[i];
			if(str.length()%2!=0) {
				int a = str.length()/2;				System.out.println(str+" -> "+str.charAt(a));
			}else {
				int a = str.length()/2-1;
				System.out.println(str+" -> "+str.charAt(a)); 
			}
		}

	}

}
