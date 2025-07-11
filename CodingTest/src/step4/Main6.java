package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		Arrays.setAll(arr, x -> x+1);
		
		for(int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		
		for(int b : arr) {
			System.out.print(b + " ");
		}
		
		sc.close();
	}
}
