package weekOneArraysAndStrings;

/* Instead of immediately converting the values, we just store indexes of them and convert
 * the values later on */
public class Q7RowColConvert0 {
	
	public static void setZeros(int[][] mat) {
		int[] rows = new int[mat.length];
		int[] cols = new int[mat[0].length];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				if(mat[i][j]==0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				if(rows[i]==1 || cols[j]==1) {
					mat[i][j] = 0;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		int M = 3;
		int N = 5;
		int[][] matrix = {{3, 5},
						 {0, 5}};
		printMatrix(matrix);
		setZeros(matrix);
		System.out.println();
		System.out.println();
		printMatrix(matrix);
	}
	
	
	public static void printMatrix(int[][] matrix) {
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "    ");
			}
			System.out.println();
		}
		
	}
}
