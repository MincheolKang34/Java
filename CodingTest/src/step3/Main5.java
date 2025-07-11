package step3;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n > 0) {
			System.out.print("long ");
			n -= 4;
		}
		System.out.println("int");
		
		sc.close();
	}
}
