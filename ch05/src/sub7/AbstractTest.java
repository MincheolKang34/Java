package sub7;

/*
 * 날짜 : 2025..07.16.
 * 이름 : 강민철
 * 내용 : 추상 클래스 실습하기
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		// 추상 클래스는 객체 생성 불가
		//Animal animal = new Animal();
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
	}
}
