/*
 15 14 13 12 11
 10 9 8 7 
 6 5 4
 3 2 
 1
 */


package pattern_note;

public class Pattern6 {

	public static void main(String[] args) {
Pattern6 obj = new Pattern6();
obj.printreversenumber();

	}
	private void printreversenumber() {
		int no=15;
		for(int i = 5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(no + " ");
				no--;
			}
			System.out.println();
		}
	}

}
