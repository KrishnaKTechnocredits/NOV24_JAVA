//return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.
//String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
//output : {"TEch1n_o##", "Tit!iksHa"}

package titiksha.Collections.Arraylist;

import java.util.ArrayList;

import java.util.List;

public class Returnname {
	boolean covertArraytolist(String arr) {
		boolean upperCase=false;
		boolean lowercase=false;
		boolean spcharacter=false;
		boolean digit=false;
	
		for(int i=0;i<arr.length();i++) {
			char ch=arr.charAt(i);
			if(Character.isUpperCase(ch)){
				upperCase=true;
			}
			else if(Character.isLowerCase(ch)) {
				lowercase= true;
			}
			
			else if(Character.isDigit(ch)) {
				digit=true;
			}
			else if(ch == '_' || ch == '!' || ch == '#' || ch == '$') {
				spcharacter= true;
			}
		}
		return upperCase&&lowercase&&digit&&spcharacter;
	}
		
	List<String> getspecialnames(String[] arr) {
		List<String> specialchararceter=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			if(covertArraytolist(arr[i])) {
				specialchararceter.add(arr[i]);
			}
	}	
		return specialchararceter;
	}
		public static void main(String[] args) {
			Returnname returnname =new Returnname ();
			String[] arr={"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};;
			List<String> output=returnname.getspecialnames(arr);
			System.out.println(output);
			
		}
	}

	
