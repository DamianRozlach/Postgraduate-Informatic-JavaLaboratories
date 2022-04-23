package asdTest;

public class matrixSum {
	public static int[][] addMatrix(int[][] a, int[][] b) {
		int[][] resultMatrix = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int x=0;x<a[i].length;x++) {
				resultMatrix[i][x]=a[i][x]+b[i][x];
			}
		}
		return resultMatrix;
	}
	
	public static void main(String[] args) {
		int[][] x= {{1,2},{3,4}};
		int[][] y= {{1,2},{3,4}};
		System.out.print(addMatrix(x, y));
	}

}
