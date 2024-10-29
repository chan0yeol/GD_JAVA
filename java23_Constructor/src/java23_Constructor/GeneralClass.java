package java23_Constructor;

// TODO 001 생성자는 클래스명과 같고 반환타입이 없는 메소드이다.
//			생성자는 명시적으로 선언(작성)하지 않아도 자동으로 생성되어 진다.(default 생성자)
/*
 * ** 생성의 순서
 * 	 1) 부모의 객체가 먼저 생성된다(super, this - 예약어).
 * 	 2) static
 *   3) 연산자 블럭
 *   4) 생성자
 */
public class GeneralClass extends ParentClass {
	
	//TODO 002 명시적으로 default 생성자를 선언하여 사용할 수 있다.
	public GeneralClass() {
		super(); // TODO 003 객체의 생성은 반드시 부모 객체의 생성으로 시작된다.
		System.out.println("난 default 생성자");
	}
	static { // static 생성자
		System.out.println("난 static");
	}
	
	{ // 연산자 블럭
		System.out.println("난 연산자블럭");
	}
}
