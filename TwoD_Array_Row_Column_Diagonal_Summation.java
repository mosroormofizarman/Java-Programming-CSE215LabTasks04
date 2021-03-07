package CSE215_labtask_04;

import java.util.Scanner;

public class TwoD_Array_Row_Column_Diagonal_Summation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row number: ");
		int row = input.nextInt();
		System.out.println("Enter the column number: ");
		int column = input.nextInt();
		
		int [][] rc = new int [row][column];
		
		System.out.println();
		System.out.println("Enter your matrix element: ");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++){
				System.out.println("[" + (i+1) + "]" + "[" + (j+1) + "]" + " = ");
				rc[i][j] = input.nextInt();			
			}
		}
		
		System.out.println();
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++){
				System.out.println("[" + (i+1) + "]" + "[" + (j+1) + "]" + " = " + rc[i][j]);		
			}
		}
		
		//Summation of Row Elements in the matrix
		System.out.println();
		for(int i = 0; i<row; i++) {
			int sum = 0;
			for(int j = 0; j<column; j++){
				sum += rc[i][j];	
			}
			System.out.println("Sum of Row elements " + (i+1) + " is" + ":" + "  " + sum);
		}
		
		//Summation of Column Elements in the matrix
		System.out.println();
		for(int i = 0; i<row; i++) {
			int sum = 0;
			for(int j = 0; j<column; j++){
				sum += rc[j][i];	
			}
			System.out.println("Sum of Column elments " + (i+1) + " is" + ":" + "  " + sum);
		}
		
		//Summation of Left Diagonal and Right Diagonal Elements in the matrix
		System.out.println();
		int sumLD = 0, sumRD = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++){
				if(i==j) {
					sumLD += rc[i][j];
				}
				if(((i+j) == row-1) || ((i+j) == column-1)) {
					sumRD += rc[i][j];
				}
			}
		}
		System.out.println("Sum of Left Diagonal elements " + " is" + ":" + "  " + sumLD);
		System.out.println("Sum of Right Diagonal elements " + " is" + ":" + "  " + sumRD);
		
		input.close();
	}

}
