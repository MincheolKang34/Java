package step8;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 1;
		int x = 1;
		
		while(x < n) {
			x += result*6;
			result++;
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
