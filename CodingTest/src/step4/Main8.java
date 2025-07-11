package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] hash_arr = new int[42];
		Arrays.fill(hash_arr, 0);
		
		for(int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			hash_arr[n%42]++;
		}
		
		int count = 0;
		for(int j : hash_arr) {
			if(j > 0)
				count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
