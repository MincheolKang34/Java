package step6;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		
		int[] abCount = new int[26];
		Arrays.fill(abCount, 0);
		
		// A = 65 a = 97
		for(int i=0; i<s.length; i++) {
			if(s[i] < 'a')
				abCount[s[i]-'A']++;
			else
				abCount[s[i]-'a']++;
		}
		
		int maxCount = Arrays.stream(abCount).max().getAsInt();
		
		int check = 0;
		int idx = 0;
		
		for(int i=0; i<26; i++) {
			if(abCount[i] == maxCount) {
				idx = i;
				check++;
			}
		}
		
		System.out.println(check > 1?'?':(char)(idx+'A'));
		sc.close();
	}
}
