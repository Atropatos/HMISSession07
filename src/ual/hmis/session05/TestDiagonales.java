package ual.hmis.session05;

public class TestDiagonales {

	public static int[][] receiveDiagonales(int[][] matrix) {
		int n = matrix.length;
		int[][] result = new int[2][n];
		
		for(int i=0; i<n; i++) {
			result[0][i]=matrix[i][i];
			result[1][i]=matrix[i][n-1-i];
		}
		
		return result;
	}
	
	public static double[] addColumns(double[][] matrix) {
		int n = matrix.length;
		double[] result = new double[n];
		
		int numberOfColumns = matrix[0].length;
		
		double[] columnSum = new double[numberOfColumns];
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				columnSum[j]+=matrix[i][j];
			}
		}
		
		return columnSum;
	}
	
}
