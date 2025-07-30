package step10;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] triangle = new int[3];
		
		triangle[0] = sc.nextInt();
		triangle[1] = sc.nextInt();
		triangle[2] = sc.nextInt();
		
		int maxLength = Arrays.stream(triangle).max().getAsInt();
		int othersLength = Arrays.stream(triangle).sum()-maxLength;
		
		if(othersLength <= maxLength)
			System.out.println(othersLength*2 - 1);
		else
			System.out.println(othersLength + maxLength);
		
		sc.close();
	}
}
