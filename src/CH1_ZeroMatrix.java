import java.util.Scanner;
import java.math.*;

/**
 * 1.8 Zero Matrix: Write an algorithm such that if an element
 * in an MxN matrix is 0, its entire row and column are set to O.
 * 
 * Runtime: O(N), in this case because even though the input is 
 * M*N in size, we only go through the input once which is the 
 * definition of O(N) 
 * 
 * @author Harsha Dodda
 *
 */
public class CH1_ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int n = 0;
		
		System.out.println("We are making an M*N matrix, please enter M: ");
		m = sc.nextInt();
		System.out.println("Please enter N: ");
		n = sc.nextInt();
		System.out.println("Here is the matrix after randomization: ");
		int[][] mat = new int[m][n];
		int randomM = (int)(Math.random() * m);
		int randomN = (int)(Math.random() * n);
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i == randomM && j == randomN) {
					mat[i][j] = 0;
				}
				else {
					int random = (int)(Math.random() * 100);
					mat[i][j] = random;
				}
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("  " + mat[i][j] + "  ");
			}
			System.out.println();
		}
		
		mat = setMatrixToZero(mat);
		
		System.out.println("Here is the matrix after adding the zeros: ");
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("  " + mat[i][j] + "  ");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public static int[][] setMatrixToZero(int[][] mat) {
		boolean[] ms = new boolean[mat.length]; // keeps track of which columns need to be 0
		boolean[] ns = new boolean[mat[0].length]; // keeps track of which rows need to be 0
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == 0) { // sets the columns and rows that need to be 0
					ms[i] = true;
					ns[j] = true;
				}
			}
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(ms[i] == true || ns[j] == true) {
					mat[i][j] = 0; // makes the columns and rows that are marked true = to 0 in the real matrix
				}
			}	
		}
		return mat;
	}

}
