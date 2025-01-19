package nilam.Array;
//Print only names having length more than 6 characters from given String array.
public class Assignment47 {
	
	void printNames(String[] name) {
		for(int index=0;index<name.length;index++) {
			if(name[index].length()>6) {
				System.out.println(name[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment47 assignment47=new Assignment47();
		String[] name={"Rohan","Premlata","Anuja","Fazrana"};
		assignment47.printNames(name);
	}
}
