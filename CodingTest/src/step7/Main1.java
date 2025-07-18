package step7;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr1 = new int[m][n];
		int[][] arr2 = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr1[i][j] + arr2[i][j]+(j<n-1?" ":""));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
