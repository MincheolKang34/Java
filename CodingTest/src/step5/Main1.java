package step5;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		int i = sc.nextInt();
		
		System.out.println(s[i-1]);
		
		sc.close();
	}
}
