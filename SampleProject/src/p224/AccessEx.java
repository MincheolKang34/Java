package p224;

/*
 * 날짜 : 2025.07.18.
 * 이름 : 강민철
 * 내용 : 교재 p224 예제 4-10 실습
 */
class Sample {
	public int a;
	private int b;
	int c; // 디폴트 접근 지정
	protected int d;
}

class Sub extends Sample {
	
	public void method() {
		d = 10;
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		sample.b = 10;
		sample.c = 10;
	}
}
