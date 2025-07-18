package step6;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		
		int count = 0;
		
		for(int i=0; i<s.length; i++) {
			switch(s[i]) {
			case 'c':
				if(i<s.length-1)
					if(s[i+1] == '=' || s[i+1] == '-')
						i++;
				break;
			case 'd':
				if(i<s.length-1)
					if(s[i+1] == '-') 
						i++;
				else if(i<s.length-2)
					if(s[i+1] == 'z' && s[i+2] == '=')
						i += 2;	
				break;
			case 'l':
				if(i<s.length-1)
					if(s[i+1] == 'j')
						i++;
				break;
			case 'n':
				if(i<s.length-1)
					if(s[i+1] == 'j')
						i++;
				break;
			case 's':
				if(i<s.length-1)
					if(s[i+1] == '=')
						i++;
				break;
			case 'z':
				if(i<s.length-1)
					if(s[i+1] == '=')
						i++;
				break;
			}
			count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
