package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		Arrays.fill(arr, 0);
		
		for(int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			Arrays.fill(arr, i-1, j, k);
		}
		
		for(int b : arr) {
			System.out.print(b + " ");
		}
		
		sc.close();
	}
}
