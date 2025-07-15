package step5;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		
		int result = 0;
		
		for(char c : s) {
			if("ABC".indexOf(c) > -1)
				result += 3;
			else if("DEF".indexOf(c) > -1) 
				result += 4;
			else if("GHI".indexOf(c) > -1) 
				result += 5;
			else if("JKL".indexOf(c) > -1) 
				result += 6;
			else if("MNO".indexOf(c) > -1) 
				result += 7;
			else if("PQRS".indexOf(c) > -1) 
				result += 8;
			else if("TUV".indexOf(c) > -1) 
				result += 9;
			else
				result += 10;
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
