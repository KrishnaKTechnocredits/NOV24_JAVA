/*Assignment - 37 : 8th Dec [20 mins]
write loop inside loop (nested for loop), and print frequency of each character. 
input : aakanksha
a->4
k->2
n->1
s->1
h->1
 */
package nitesh.nestedloop;

class FreqUsingNestedLoop{

	void printFreq(String str){
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(str.indexOf(ch)==i){
				int count =0;
				for(int j=0;j<str.length();j++){
					char ch1 = str.charAt(j);
					if(ch==ch1){
						count++;
					}

				}
				System.out.println(ch + " -> " + count);
			}

		} 
	}
	public static void main(String[] args){
		FreqUsingNestedLoop frequsingnestedloop = new FreqUsingNestedLoop();
		frequsingnestedloop.printFreq("aakanksha");
	}
}