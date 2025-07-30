package step10;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] checkX = new int[1000];
		int[] checkY = new int[1000];
		Arrays.fill(checkX, 0);
		Arrays.fill(checkY, 0);
		int x = 0;
		int y = 0;
		
		for(int i=0; i<3; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			checkX[x-1]++;
			checkY[y-1]++;
		}
		
		for(int i=0; i<1000; i++) {
			if(checkX[i] == 1) {
				System.out.print((i+1)+" ");
				break;
			}
		}

		for(int i=0; i<1000; i++) {
			if(checkY[i] == 1) {
				System.out.println((i+1));
				break;
			}
		}
		
		sc.close();
	}
}
