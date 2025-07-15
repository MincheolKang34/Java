package sub6;

public class PolyTest {
	
	public static void main(String[] args) {
		
		// 다형성 - 자식 객체의 타입선언을 부모타입으로 선언
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
	}
}
