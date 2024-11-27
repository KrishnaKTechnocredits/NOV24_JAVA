package akashL;

public class Aakash_Assignment18 {
	
		void getLastDivNumber (int startRange, int endtRange ) {
			int count=0;
			
			for (int num=endtRange; num>=startRange;num--) {
				if (num%5==0) {
					System.out.println(num);
					count++;
					if (count==1) {
						break;
					}
				}
			}
		}
		
		public static void main(String[] args) {
			Aakash_Assignment18 aakash_Assignment18=new Aakash_Assignment18();
			aakash_Assignment18.getLastDivNumber(10, 498);
			
		}

}
