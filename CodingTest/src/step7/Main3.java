package step7;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[5];
		int maxLength = 0;
		
		for(int i=0; i<5; i++) {
			s[i] = sc.next();
			if(s[i].length() > maxLength)
				maxLength = s[i].length();
		}
		
		for(int i=0; i<maxLength; i++) {
			for(int j=0; j<5; j++) {
				if(i < s[j].length())
					System.out.print(s[j].charAt(i));
			}
		}
		
		sc.close();
	}
}
