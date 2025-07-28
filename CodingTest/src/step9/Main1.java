package step9;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x == 0 && y == 0)
				break;
			else if(x == 0 || y == 0)
				System.out.println("neither");
			else {
				if(x/y > 0 && x%y == 0)
					System.out.println("multiple");
				else if(y/x > 0 && y%x == 0)
					System.out.println("factor");
				else
					System.out.println("neither");
			}
		}
		
		sc.close();
	}
}
