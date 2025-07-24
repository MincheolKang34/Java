package step8;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), v = sc.nextInt();
		int result = 0;
		
		if(a%(a-b) >= v%(a-b))
			result = (v/(a-b)) - (a/(a-b)) + 1;
		else
			result = (v/(a-b)) - (a/(a-b)) + 2;
		
		System.out.println(result);
		
		sc.close();
	}
}
