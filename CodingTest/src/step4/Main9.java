package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		Arrays.setAll(arr, x -> x+1);
		
		for(int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			SortReverse(arr, i, j);
		}
		
		for(int b : arr) {
			System.out.print(b + " ");
		}
		
		sc.close();
	}
	
	public static void SortReverse(int[] arr, int start, int end) {
		if(start == end)
			return;
		
		int temp = 0;
		start--;
		end--;
		
		for(int i = 0; i <= (end-start)/2; i++) {
			temp = arr[start+i];
			arr[start+i] = arr[end-i];
			arr[end-i] = temp;
		}
	}
}
