package sachin;

public class Assignment18 {

		 int getLastDivNum(int start,int end) {
			for (;end>=start;end--) {
				if(end%5==0) {
					return end;
				}
			}
			return 0;
		}
		
		public static void main(String[] args) {
			Assignment18 assignment18=new Assignment18();
			System.out.println(assignment18.getLastDivNum(10, 498)+" is the last number which is div by 5 in the given range.");
		}
}
