package step4;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			if(x > Integer.parseInt(s[i]))
				System.out.print(s[i] + " ");
		}
		
		sc.close();
	}
}
