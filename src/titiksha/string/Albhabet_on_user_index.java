//Find char on given index

package titiksha.string;

public class Albhabet_on_user_index {
	char alp;
	int index_ofchar;
	char getchararcter(String name,int value) {
		System.out.println("The character at given index is :");
		for(int index=0;index<name.length();index++) {
			  alp=name.charAt(value);
		}
		return alp;
			
		}
	
	public static void main(String[] args) {
		Albhabet_on_user_index alp=new Albhabet_on_user_index();
		char alpha=alp.getchararcter("Titiksha",5);
		System.out.println(alpha);
				
	}
	}
	

