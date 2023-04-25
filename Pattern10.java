/*
 5
 4 5
 3 4 5
 2 3 4 5
 1 2 3 4 5
 */

package pattern_note;

public class Pattern10 {

	public static void main(String[] args) {
Pattern10 obj = new Pattern10();
obj.print_number();
	}
private void print_number() {
	for(int i=5; i>=1; i--) {
	for(int j=i; j<=5; j++) {
		System.out.print(j + " ");
	}
	System.out.println();
}
}
}
