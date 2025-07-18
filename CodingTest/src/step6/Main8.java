package step6;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double gpa = 0;
		int credit = 0;
		
		for(int i=0; i<20; i++) {
			String[] s = sc.nextLine().split(" ");
			switch(s[2]) {
			case "A+":
				gpa += Double.parseDouble(s[1])*4.5;
				credit += Double.parseDouble(s[1]);
				break;
			case "A0":
				gpa += Double.parseDouble(s[1])*4.0;
				credit += Double.parseDouble(s[1]);
				break;
			case "B+":
				gpa += Double.parseDouble(s[1])*3.5;
				credit += Double.parseDouble(s[1]);
				break;
			case "B0":
				gpa += Double.parseDouble(s[1])*3.0;
				credit += Double.parseDouble(s[1]);
				break;
			case "C+":
				gpa += Double.parseDouble(s[1])*2.5;
				credit += Double.parseDouble(s[1]);
				break;
			case "C0":
				gpa += Double.parseDouble(s[1])*2.0;
				credit += Double.parseDouble(s[1]);
				break;
			case "D+":
				gpa += Double.parseDouble(s[1])*1.5;
				credit += Double.parseDouble(s[1]);
				break;
			case "D0":
				gpa += Double.parseDouble(s[1])*1.0;
				credit += Double.parseDouble(s[1]);
				break;
			case "F":
				gpa += Double.parseDouble(s[1])*0;
				credit += Double.parseDouble(s[1]);
				break;
			}
		}
		
		System.out.println(gpa==0?gpa:gpa/credit);
		
		sc.close();
	}
}
