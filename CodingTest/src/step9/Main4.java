package step9;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		Arrays.fill(arr, 0);
		
		
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			
			boolean check = true;
			for(int j=2; j*j<=m; j++) {
				if(m%j == 0) {
					check = false;
					break;
				}
			}
			
			if(m == 1)
				continue;
			else {
				if(check)
					arr[i]++;
			}
		}

		System.out.println(Arrays.stream(arr).sum());
		
		sc.close();
	}
}
