package sub2;

/*
 * 날짜 : 2025.07.07.
 * 이름 : 강민철
 * 내용 : Java 다양한 출력 실습
 */

public class PrintTest {
	
	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java"); // 한 줄 복사 : ctrl + alt + 방향키(위/아래)
		System.out.println("Hello Korea"); // 한 줄 삭제 : ctrl + d
		System.out.println("Hello Busan"); // 작업 취소 : ctrl + z
		
		// 한 줄 출력
		System.out.print("Welcome"); // ln(줄바꿈; 개행) 처리가 안 되기 때문에 그 다음 출력문이 바로 이어서 출력됨.
		System.out.print("Java!");
		
		// 개행 출력
		//System.out.println(); // 줄바꿈
		System.out.print("Welecome\n");
		System.out.print("Korea!");
		
	}

}
