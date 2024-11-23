package fazrana;

public class FAssignment18 {

		int getLastDivNum(int start,int end) {
			for (;end>=start;end--) {
				if(end%5==0) {
					return end;
				}
			}
			return 0;
		}
		
		public static void main(String[] args) {
			FAssignment18 fassignment18=new FAssignment18();
			System.out.println(fassignment18.getLastDivNum(10, 498)+" is the last number which is div by 5 in the given range.");
		}
}
