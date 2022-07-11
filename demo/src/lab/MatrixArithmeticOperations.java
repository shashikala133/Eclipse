package lab;
import java.util.Scanner;
public class MatrixArithmeticOperations
{
	private static Scanner sc;
	public static void main(String[] args) {
		int i, j, rows, columns;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Please Enter Matrix Rows andColumns : ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		int[][] arr1 = new int[rows][columns];
		int[][] arr2 = new int[rows][columns];
		int[][] add = new int[rows][columns];
		int[][] mul = new int[rows][columns];
		System.out.println("\n Please Enter the First Matrix Items : ");
		for(i = 0; i<rows; i++) {
			for(j = 0; j<columns; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n Please Enter the Second Matrix Items : ");
		for(i = 0; i<rows; i++) {
			for(j = 0; j<columns; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatrix Addition : ");
		for(i = 0; i<rows; i++) {
			for(j = 0; j<columns; j++) {
				add[i][j] = arr1[i][j] + arr2[i][j];
				System.out.format("%d \t", add[i][j]);
			}
			System.out.format("\n");
		}
		System.out.println("\nMatrixMultiplcation : ");
		for(i = 0; i<rows; i++) {
			for(j = 0; j<columns; j++) {
				mul[i][j] = arr1[i][j] * arr2[i][j];
				System.out.format("%d \t", mul[i][j]);
			}
			System.out.format("\n");
		}
	}
}