package step5;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			char[] c = sc.next().toCharArray();
			System.out.printf("%c%c\n", c[0], c[c.length-1]);
		}
		
		sc.close();
	}
}
