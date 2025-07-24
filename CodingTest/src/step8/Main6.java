package step8;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int[] fraction = {1, 1};
		int state = 0;
		
		for(int i=0; i<x-1; i++) {
			if(fraction[0]==1 && fraction[1]%2==1) {
				fraction[1]++;
				state = 1;
				continue;
			}else if(state==1) {
				fraction[0]++;
				fraction[1]--;
				if(fraction[1]==1)
					state = 0;
				continue;
			}else if(fraction[0]%2==0 && fraction[1]==1) {
				fraction[0]++;
				state = 2;
				continue;
			}else if(state==2) {
				fraction[0]--;
				fraction[1]++;
				if(fraction[0]==1)
					state = 0;
			}
		}
		
		System.out.println(fraction[0]+"/"+fraction[1]);
		
		sc.close();
	}
}
