package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		double avg = Arrays.stream(arr).average().orElse(0);
		System.out.println(avg/max*100);
		
		sc.close();
	}
}
