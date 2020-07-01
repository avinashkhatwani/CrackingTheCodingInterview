package weekThreeStacksAndQueues;

/*  One disc - Move it from A(source) to C(Dest) - This is the Print statement
 * 	2 Discs - For 2 discs we use auxillary tower
 * 			We basically break it down to sub problem i.e. move 2 discs from A->B denoted as TOH(2, A,C,B)
 * 			this is further broken down a. Move 1 A->c, A->b, C->B	
 * 3 Discs - Now we can use the generalized n-1 formula i.e.
 * 			Move 2 Discs from A->B, 1 Disc from A->C and then the two remaining from B->C */

public class Q4TowerOfHanoi {

	static void TOH(int n, int A, int B, int C) {
		if(n>0) {
			TOH(n-1, A, C, B);
			System.out.printf("Move disc from %d to %d",A, C);
			System.out.println();
			TOH(n-1, B, A, C);
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		TOH(n, 1, 2, 3);
	}
	
}
