package sub1;

import javax.net.ssl.SNIHostName;

/*
 * 날짜 : 2025.07.14.
 * 이름 : 강민철
 * 내용 : 자바 객체지향 프로그래밍 클래스 실습하기
 */
public class ClassTest {

	public static void main(String[] args) {
		
		// 객체 생성(인스턴스화)
		Car sonata = new Car(); // 사용자가 정의한 타입(참조타입), sonata는 객체(Object)
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용(기능 활용)
		sonata.speedUp(80);
		sonata.speedDown(10);
		sonata.show();
		
	}
}
