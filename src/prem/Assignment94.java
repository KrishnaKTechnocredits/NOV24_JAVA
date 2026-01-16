package prem;

import java.util.*;

public class Assignment94 {
	
		void m1() {
		ArrayList<Builder> bd = new ArrayList<Builder>();
		bd.add(new Builder("Prem","Pune", 30000,100000));
		bd.add(new Builder("Robin","Mumbai", 15000,200000));
		bd.add(new Builder("Avi","Delhi", 20000,150000));
		bd.add(new Builder("Ishaan","UP", 10000,125000));
		
		System.out.println(bd);
		Collections.sort(bd);
		System.out.println(bd);
		
		}
		
		
		public static void main(String[] args) {
			Assignment94 assign94 = new Assignment94();
			assign94.m1();
	}

}
