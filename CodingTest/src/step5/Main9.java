package step5;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.nextLine().toCharArray();
		
		char temp = 0;
		for(int i=0; i<3; i++) {
			temp = s[i];
			s[i] = s[s.length-1-i];
			s[s.length-1-i] = temp;
		}
		
		String[] str = String.valueOf(s).split(" ");
		
		int[] i = new int[2];
		for(int j=0; j<2; j++) {
			i[j] = Integer.parseInt(str[j]);
		}
		
		if(i[0] > i[1])
			System.out.println(i[0]);
		else
			System.out.println(i[1]);
		
		sc.close();
	}
}
