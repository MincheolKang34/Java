package step6;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;

		for(int i=0; i<2*n-1; i++) {
			for(int j=0; j<n-1-count; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*count)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n-1)
				count++;
			else
				count--;
		}
		
		sc.close();
	}
}
