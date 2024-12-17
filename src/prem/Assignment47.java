package prem;

public class Assignment47 {
	
	void printStringMoreThan6Char(String[] name){
		for (int i=0;i < name.length ;i++) {
		String str = name[i];
			if(str.length()>6){
			System.out.println(name[i]);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment47 assign47 =new Assignment47();
		String[] name ={"Rohan", "Premlata", "Anuja", "Fazrana"};
		assign47.printStringMoreThan6Char(name);
	
	}
}
