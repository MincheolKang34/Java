package step5;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.nextLine().toCharArray();
		
		for(int i=0; i<3; i++) {
			char temp = s[i];
			s[i] = s[s.length-1-i];
			s[s.length-1-i] = temp;
		}
		
		String[] str = s.toString().split(" ");
		
		int[] i = new int[2];
		for(String stoi : str) {
			
		}
		
		sc.close();
	}
}
