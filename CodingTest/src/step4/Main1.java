package step4;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		int v = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(v == Integer.parseInt(s[i])) 
				count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
