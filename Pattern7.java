/*
 1 2 3 4 5
 2 3 4 5
 3 4 5 
 4 5
 5
 */


package pattern_note;

public class Pattern7 {

	public static void main(String[] args) {
Pattern7 obj = new Pattern7();
obj.printnumber();
	}
private void printnumber() {
	
	for(int i= 1; i<=5; i++) {
		for(int j=i; j<=5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	
}
}
