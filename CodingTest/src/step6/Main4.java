package step6;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		
		int check = 0;
		for(int i=0; i<s.length/2; i++) {
			if(s[i] != s[s.length-1-i])
				check = 1;
		}
		System.out.println(check == 0?1:0);
		
		sc.close();
	}
}
