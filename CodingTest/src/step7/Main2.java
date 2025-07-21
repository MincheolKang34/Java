package step7;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		
		for(int i=0; i<9; i++) {
			if(max < Arrays.stream(arr[i]).max().getAsInt())
				max = Arrays.stream(arr[i]).max().getAsInt();
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(max == arr[i][j]) {
					System.out.println(max);
					System.out.println((i+1) + " " + (j+1));
					break;
				}
			}
		}
		
		sc.close();
	}
}
