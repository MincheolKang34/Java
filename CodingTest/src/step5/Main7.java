package step5;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int r = sc.nextInt();
			char[] s = sc.next().toCharArray();
			for(char c : s) {
				for(int j = 0; j < r; j++) {
					System.out.print(c);
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
