package step8;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int c = 0;
		
		for(int i=0; i<t; i++) {
			c = sc.nextInt();
			System.out.print(c/25 + " ");
			System.out.print(c%25/10 + " ");
			System.out.print(c%25%10/5 + " ");
			System.out.print(c%25%10%5 + " ");
			System.out.println();
		}
		
		sc.close();
	}
}
