package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[28];
		
		for(int i = 0; i < 28; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int check = 0;
		
		if(arr[0] != 1) {
			check++;
			System.out.println(1);
		}
		
		for(int j = 0; j < 27; j++) {
			if(arr[j] != arr[j+1]-1) {
				System.out.println(arr[j]+1);
				check += 1;
			}
		}
		
		if(check == 1) {
			if(arr[27] == 29) {
				System.out.println(30);
			}else {
				System.out.println(2);
			}
		}else if(check == 0) {
			System.out.println(29 + "\n" + 30);
		}
		
		sc.close();
	}
}
