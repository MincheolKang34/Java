package step10;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] triangle = new int[3];
		
		while(true) {
			triangle[0] = sc.nextInt();
			triangle[1] = sc.nextInt();
			triangle[2] = sc.nextInt();
			
			if(triangle[0] == 0 & triangle[1] == 0 && triangle[2] == 0)
				break;
			else {
				int maxLength = Arrays.stream(triangle).max().getAsInt();
				if(maxLength >= Arrays.stream(triangle).sum()-maxLength)
					System.out.println("Invalid");
				else if(Arrays.stream(triangle).allMatch(x -> x == maxLength))
					System.out.println("Equilateral");
				else if(triangle[0]==triangle[1] || triangle[0]==triangle[2] || triangle[2]==triangle[1])
					System.out.println("Isosceles");
				else 
					System.out.println("Scalene");
			}
		}
		
		sc.close();
	}
}
