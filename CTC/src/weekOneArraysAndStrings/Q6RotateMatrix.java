package weekOneArraysAndStrings;

public class Q6RotateMatrix {

	public static void rotate(int[][] mat) {
		int N = mat.length;
		for(int x=0; x<N/2; x++) {
			for(int y=x; y<N-1-x; y++) {
				int temp = mat[x][y];
				mat[x][y] = mat[y][N-1-x];
				mat[y][N-1-x] = mat[N-1-x][N-1-y];
				mat[N-1-x][N-1-y] = mat[N-1-y][x];
				mat[N-1-y][x] = temp;
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		int[][] matrix =  { 
	            { 1, 2, 3, 4 }, 
	            { 5, 6, 7, 8 }, 
	            { 9, 10, 11, 12 }, 
	            { 13, 14, 15, 16 } 
	        };
		printMatrix(matrix);
		rotate(matrix);
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
