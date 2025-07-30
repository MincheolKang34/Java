package step10;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt();
		int w = sc.nextInt(), h = sc.nextInt();
		
		int shortX = 0, shortY = 0;
		
		if(x <= w) {
			if(w/2 < x) {
				shortX = w - x;
			}else
				shortX = x;
		}else
			shortX = x - w;

		if(y <= h) {
			if(h/2 < y) {
				shortY = h - y;
			}else
				shortY = y;
		}else
			shortY = y - h;
		
		System.out.println(Math.min(shortX, shortY));
		
		sc.close();
	}
}
