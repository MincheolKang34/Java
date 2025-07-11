package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] hash_arr = new int[30];
		Arrays.fill(hash_arr, 0);
		
		for(int i = 0; i < 28; i++) {
			int n = sc.nextInt();
			hash_arr[n-1]++;
		}
		
		for(int j = 0; j < 30; j++) {
			if(hash_arr[j] == 0)
				System.out.println(j+1);
		}
		
		sc.close();
	}
}
