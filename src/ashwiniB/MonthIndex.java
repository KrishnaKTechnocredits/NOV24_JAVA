package ashwiniB;

public class MonthIndex {
	int monthindex;
	void monthIndex(int monthindex) {
		 if(monthindex < 1) {
	            System.out.println("invalid month index, it can't be negative.");
	        } else if (monthindex > 12) {
	            System.out.println("invalid month index, it can't be greater than 13.");
	        } else {
		if(monthindex>=1 && monthindex <=3){
			if(monthindex==1) {
				System.out.println("Month index 1 is in Q1, its Janauary");
				}else if(monthindex==2) {
					System.out.println("Month index 2 is in Q1, its February");
					}else {
						System.out.println("Month index 3 is in Q1, its March");
					}
		}
				if(monthindex>=4 && monthindex<=6){
					if(monthindex==4) {
						System.out.println("Month index 4 is in Q2, its April");
						}else if(monthindex==5) {
							System.out.println("Month index 5 is in Q2, its May");
							}else {
								System.out.println("Month index 6 is in Q2, its June");
							}
				}
				if(monthindex>=7 && monthindex<=9){
							if(monthindex==7) {
								System.out.println("Month index 7 is in Q3, its July");
								}else if(monthindex==8) {
									System.out.println("Month index 8 is in Q3, its August");
									}else {
										System.out.println("Month index 9 is in Q3, its September");
									}
						}if(monthindex>=10 && monthindex<=12){
							if(monthindex==10) {
								System.out.println("Month index 7 is in Q3, its July");
								}else if(monthindex==11) {
									System.out.println("Month index 8 is in Q3, its August");
									}else {
										System.out.println("Month index 9 is in Q3, its September");
									}
						}
	        }
	}
	public static void main(String[] args) {
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.monthIndex(5);
		monthIndex.monthIndex(2);
		monthIndex.monthIndex(-3);
		monthIndex.monthIndex(13);
		

	}

}
