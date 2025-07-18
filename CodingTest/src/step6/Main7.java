package step6;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			char[] s = sc.next().toCharArray();
			char temp = 0;
			boolean isGroup = true;
			String check = "";
			for(int j=0; j<s.length; j++) {
				if(j == 0) {
					check += s[j];
					temp = s[j];
				}else {
					if(temp != s[j]) {
						if(!(check.contains(""+s[j]))) {
							check += s[j];
							temp = s[j];
						}else {
							isGroup = false;
							break;
						}
					}
				}
			}
			if(isGroup) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
