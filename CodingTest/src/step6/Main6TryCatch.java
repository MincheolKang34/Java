package step6;

import java.util.Scanner;

public class Main6TryCatch {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		
		int count = 0;
        int i = 0;
		try {
			for(; i<s.length; i++) {
				switch(s[i]) {
				case 'c':
					if(s[i+1] == '=' || s[i+1] == '-')
						i++;
					break;
				case 'd':
					if(s[i+1] == '-')
						i++;
					else if(s[i+1] == 'z')
						if(s[i+2] == '=')
							i += 2;
					break;
				case 'l':
					if(s[i+1] == 'j')
						i++;
					break;
				case 'n':
					if(s[i+1] == 'j')
						i++;
					break;
				case 's':
					if(s[i+1] == '=')
						i++;
					break;
				case 'z':
					if(s[i+1] == '=')
						i++;
					break;
				}
				count++;
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			if(i == s.length-2)
                count += 2;
            else
                count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
