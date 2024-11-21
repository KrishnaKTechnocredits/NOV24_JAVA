//Assignment_10
package ravindra;
public class QuarterIndex {
	void monthIndex(int monthIndex) {
	if(monthIndex>=1 && monthIndex<=3) {
		System.out.println("Month index is " +monthIndex+" in Q1, its Febuary.");
	}
	else if(monthIndex>=4 && monthIndex<=6) {
		System.out.println("Month index is "+monthIndex+" in Q2, its May.");
	}
	else if(monthIndex>=7 && monthIndex<=9) {
		System.out.println("Month index is "+monthIndex+" in Q2, its ");
	}
	else if(monthIndex>=10 && monthIndex<=12) {
		System.out.println("Month index is "+monthIndex+" in Q2, its ");
	}
	else if(monthIndex>12) {
		System.out.println("invalid month index,"+monthIndex+" it can't be greater than 13.");
	}
	else {
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
