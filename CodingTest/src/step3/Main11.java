package step3;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[][] arr = new int[t][2];
		
		for (int i = 0; i < t; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for (int j = 0; j < t; j++) {
			System.out.println(arr[j][0]+arr[j][1]);
		}
		
		sc.close();
	}
}
