/*
* * * * * 
* * * *
* * *
* *
*
*/

package pattern_note;

public class Pattern2 {

	public static void main(String[] args) {
Pattern2 obj = new Pattern2();
obj.print_star();
	}

	private void print_star() {
for(int i = 5; i>=1; i--) {
	for(int j=1; j<=i; j++) {
		System.out.print('*' + " ");
	}
	System.out.println();
}
	}
}
