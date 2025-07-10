package step2;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m < 45) {
			if (h == 0) {
				System.out.println(23 + " " + (60 - (45 - m)));
			}else {
				System.out.println((h - 1) + " " + (60 - (45 - m)));
			}
		}else {
			System.out.println(h + " " + (m - 45));
		}
		
		sc.close();
	}
}
