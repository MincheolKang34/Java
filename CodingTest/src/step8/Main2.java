package step8;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		String result = "";
		
		result = decimalToB(n, b, result);
		
		System.out.println(result);
		
		sc.close();
	}
	
	public static String decimalToB(int n, int b, String result) {
		if(n == 0)
			return result;
		else {
			if(n%b > 9) 
				result = (char)((n%b) - 10 + 'A') + result;
			else
				result = (n % b) + result;
			return decimalToB(n/b, b, result);
		}
	}
}
