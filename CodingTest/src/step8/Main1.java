package step8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int b = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<n.length(); i++) {
			if(Pattern.matches("[A-Z]?", ""+n.charAt(i)))
				result = result*b + n.charAt(i) - 'A' + 10;
			else
				result = result*b + Integer.parseInt(""+n.charAt(i));
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
