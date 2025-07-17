package step6;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		
		int[] chess = new int[6];
		for(int i=0; i<6; i++) {
			chess[i] = Integer.parseInt(s[i]);
		}
		
		int[] correctSet = {1, 1, 2, 2, 2, 8};
		
		for(int i=0; i<6; i++) {
			System.out.print(correctSet[i]-chess[i]+" ");
		}
		
		sc.close();
	}
}
