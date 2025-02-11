package swapnil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment100 {
	
	void findFrq(String str) {
	Map<Character, Integer> hm = new HashMap<>();
	int value = 1;
	for(int i=0; i<str.length();i++) {
		Character ch = str.charAt(i);
		if(hm.containsKey(ch)) {
			value=hm.get(ch);
			hm.put(ch,(value+1));
			}
		else {
			hm.put(ch, 1);
		}
	}
	System.out.println("freq of characteris : ");
	System.out.println(hm);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String to find freq: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		new Assignment100().findFrq(str);
		sc.close();
	}
}
