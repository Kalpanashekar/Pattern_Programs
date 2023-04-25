/*
5 
5 4
5 4 3
5 4 3 2
5 4 3 2 1
 
*/



package pattern_note;

public class Pattern9 {

	public static void main(String[] args) {
Pattern9 obj = new Pattern9();
obj.print5_1();
	}
private void print5_1() {
	for(int i = 5; i>=1; i--) {
		for(int j = 5; j>=i; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
}

