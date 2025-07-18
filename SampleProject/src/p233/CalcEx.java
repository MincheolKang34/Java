package p233;

/*
 * 날짜 : 2025.07.19.
 * 이름 : 강민철
 * 내용 : 교재 p233 예제 4-11 실습
 */
class Calc {
	public static int abs(int a) { return a>0?a:-a; }
	public static int max(int a, int b) { return (a>b)?a:b; }
	public static int min(int a, int b) { return (a>b)?b:a; }
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}
