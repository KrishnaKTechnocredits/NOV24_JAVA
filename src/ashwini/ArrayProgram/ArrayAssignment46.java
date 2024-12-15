package ashwini.ArrayProgram;

public class ArrayAssignment46 {
	void midCharName() {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for(int index=0;index<names.length;index++) {
			if((names[index].length()) % 2==0){
			System.out.println(names[index]+"-->"+ names[index].charAt((names[index].length()/2)-1));	
		}else {
			System.out.println(names[index]+"-->"+ names[index].charAt(names[index].length()/2));	
		}
		}
	
	}

	public static void main(String[] args) {
		ArrayAssignment46 assn46=new ArrayAssignment46();
		assn46.midCharName();
	}
}

	

	