package swapnil;
import java.util.ArrayList;
import java.util.List;

public class Assignment76 {
	boolean checkCondition(String str) {
		boolean uCase = false;
		boolean lCase = false;
		boolean dCase = false;
		boolean spCase = false;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				uCase=true;
			}
			else if(Character.isLowerCase(ch)) {
				lCase=true;
			}else if(Character.isDigit(ch)) {
				dCase=true;
			}else if(ch == '_' || ch == '!' ||ch == '#' || ch=='$') {
				spCase=true;
			}
		}
		return uCase && lCase && dCase && spCase;
	}
	List<String> getNameWithUpperLowerDigitSp(String[] arr){
		List<String> name = new ArrayList<String>();
		for(int j=0;j<arr.length;j++) {
			String str = arr[j];
			boolean flag = checkCondition(str);
			if(flag) {
				name.add(str);
			}
		}
		return name;
		
	}
	public static void main(String[] args) {
		String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
		Assignment76 A = new Assignment76();
		List<String> output = A.getNameWithUpperLowerDigitSp(arr);
		System.out.println(output);
	}
	}
