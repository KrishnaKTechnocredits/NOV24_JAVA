package pranita;

public class Assignment_10 {

		void monthindex (int mindex){
			if (mindex < 1 ){
				System.out.println ("Invalid month index, it can't be negative");
			
			}else if (mindex < 3 && mindex > 1){
				if (mindex == 1){
					System.out.println ("Month index " +mindex+ " is in Q1, its January");
				} else if (mindex == 2){
					System.out.println ("Month index " +mindex+ " is in Q1, its February");
				} else if (mindex == 3){
					System.out.println ("Month index " +mindex+ " is in Q1, its March");
				}
				
			}else if (mindex < 6 && mindex > 4){
				if (mindex == 4){
					System.out.println ("Month index " +mindex+ " is in Q2, its April");
				} else if (mindex == 5){
					System.out.println ("Month index " +mindex+ " is in Q2, its May");
				} else if (mindex == 6){
					System.out.println ("Month index " +mindex+ " is in Q2, its June");
				}
			
			}else if (mindex < 9 && mindex > 7){
				if (mindex == 7){
					System.out.println ("Month index " +mindex+ " is in Q3, its July");
				} else if (mindex == 8){
					System.out.println ("Month index " +mindex+ " is in Q3, its August");
				} else if (mindex == 9){
					System.out.println ("Month index " +mindex+ " is in Q3, its September");
				}
			
			}else if (mindex < 12 && mindex > 10){
				if (mindex == 10){
					System.out.println ("Month index " +mindex+ " is in Q4, its October");
				} else if (mindex == 11){
					System.out.println ("Month index " +mindex+ " is in Q4, its November");
				} else if (mindex == 12){
					System.out.println ("Month index " +mindex+ " is in Q4, its December");
				}
			}else {
				System.out.println ("Invalid month index, it can't be greater than 12");
			}
		}
			
			public static void main (String [] args){
				Assignment_10 mindex = new Assignment_10();
				mindex.monthindex(5);
				mindex.monthindex(2);
				mindex.monthindex(-3);
				mindex.monthindex(13);
			}
}

