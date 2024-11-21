//Assignment_10
package ravindra;
public class QuarterIndex {
	void monthIndex(int monthIndex) {
	if(monthIndex>=1 && monthIndex<=3) {
		if(monthIndex==1) {
			System.out.println("Month index is " +monthIndex+" in Q1, its January.");
		}
		else if(monthIndex==2) {
		System.out.println("Month index is " +monthIndex+" in Q1, its February.");
		}
		else {
			System.out.println("Month index is " +monthIndex+" in Q1 its March.");
		}	
	}
	if(monthIndex>=4 && monthIndex<=6) {
		if(monthIndex==4) {
			System.out.println("Month index is " +monthIndex+" in Q2, its Aril.");
		}
		else if(monthIndex==5) {
		System.out.println("Month index is " +monthIndex+" in Q2, its May.");
		}
		else {
			System.out.println("Month index is " +monthIndex+" in Q2 its Jun.");
		}	
	}
	if(monthIndex>=7 && monthIndex<=9) {
		if(monthIndex==7) {
			System.out.println("Month index is " +monthIndex+" in Q3, its July.");
		}
		else if(monthIndex==8) {
		System.out.println("Month index is " +monthIndex+" in Q3, its August.");
		}
		else {
			System.out.println("Month index is " +monthIndex+" in Q3 its september.");
		}	
	}if(monthIndex>=10 && monthIndex<=12) {
		if(monthIndex==10) {
			System.out.println("Month index is " +monthIndex+" in Q4, its Octomber.");
		}
		else if(monthIndex==11) {
		System.out.println("Month index is " +monthIndex+" in Q1, its November.");
		}
		else {
			System.out.println("Month index is " +monthIndex+" in Q1 its December.");
		}	
	}
	if(monthIndex>12) {
		System.out.println("invalid month index,"+monthIndex+" it can't be greater than 13.");
	}
	else if(monthIndex<0){
		System.out.println("invalid month index, it can't be negative");
	}
}
	
	public static void main(String []args) {
		QuarterIndex quarterIndex=new QuarterIndex();
		quarterIndex.monthIndex(5);
		quarterIndex.monthIndex(2);
		quarterIndex.monthIndex(-3);
		quarterIndex.monthIndex(13);
	}
}
