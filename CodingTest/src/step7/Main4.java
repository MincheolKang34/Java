package step7;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int area = 0;
		
		int n = sc.nextInt();
		
		int[][] paper = new int[100][100];
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=0+x; j<x+10; j++) {
				for(int k=0+y; k<y+10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			area += Arrays.stream(paper[i]).sum();
		}
		
		System.out.println(area);
		
		sc.close();
	}
}
