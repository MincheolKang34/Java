package step5;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.nextLine().toCharArray();

		int count = 0;
		
		for(int i=0; i<s.length; i++) {
			if(s[i] == ' ') {
				if(i == 0)
					continue;
				count++;
			}
		}
		if(s[s.length-1] != ' ')
			count++;
		
		System.out.println(count);
		
		sc.close();
	}
}
