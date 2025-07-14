package step5;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        char[] s = sc.next().toCharArray();

        for(int i = 0; i < s.length; i++){
            if(arr[s[i]-'a'] == -1){
                arr[s[i]-'a'] = i;
            }
        }

        for(int j : arr){
            System.out.print(j+" ");
        }
        sc.close();
	}
}
