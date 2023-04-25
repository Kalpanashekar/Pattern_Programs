/*
 1 2 3 4 5
 6 7 8 9 
 10 11 12
 13 14
 15
 */



package pattern_note;

public class Pattern5 {

	public static void main(String[] args) {
Pattern5 obj = new Pattern5();
obj.print1to15();
	}
private void print1to15() {
	int no =1;

	for(int i=5; i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print(no+ " ");
			no++;
		}
		System.out.println();
	}
	
}
}
