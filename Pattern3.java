/*
* 
* * 
* * * 
* * * *
* * * * *
*/



package pattern_note;

public class Pattern3 {

	public static void main(String[] args) {
		Pattern3 obj = new Pattern3();
		obj.print_star_revise();
	}

void print_star_revise() {
	for(int i= 1; i<=5; i++) {
	for (int j=1; j<=i; j++) {
		System.out.print('*' + " ");
	}
		System.out.println();
	}
}
	}
	