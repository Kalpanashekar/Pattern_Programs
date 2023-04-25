/*
5 10 15 20 25
4 8 12 16
3 6 9 
2 4
1
*/
 


package pattern_note;

public class Pattern4 {

	public static void main(String[] args) {
Pattern4 obj = new Pattern4();
obj.printofincreasingthesamenumber ();
}
private void printofincreasingthesamenumber() {
	for(int i =5; i>=1; i--) {
		for(int j = 1; j<=i; j++) {
			System.out.print(j*i + " ");
			
		}
		System.out.println();
	}
	
}
}
