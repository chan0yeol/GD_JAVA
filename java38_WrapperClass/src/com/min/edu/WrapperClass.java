package com.min.edu;
/*
 * 기본타입은 크기(byte단위 = 8bit)와 형태의 변환이다 => Casting / Promotion
 * 참조타입은 부모와 자식간의 관계에 따른 변화 => up/down Casting
 */
public class WrapperClass {
	// TODO 001 Boxing
	// int -> Integer : Boxing
	public void wrapper_01() {
		int n = 10; 
		Integer i = new Integer(n); // deprecate 되었다. 예전 방식
		Integer ii = n; // autoBoxing
		
		
	} // 01 end
	
	// TODO 002 unBoxing
	public void wrapper_02() {
		Integer i = 10;
		int nn = i;
		int n = i.intValue();
	}
	
	// TODO 003 Wrapper Class 해당 객체의 값으로 hashcode를 오버라이드 한다. 
	public void wrapper_03() {  
		Float f = 3.14f; // autoBoxing
		
		System.out.println(f.hashCode());
		
		Integer i = 10;
		System.out.println(i.hashCode());
		System.out.println(System.identityHashCode(i));
	}
	
	// TODO 004 형변환의 주의점
	public void wrapper_4() {
		int n = 10; // 기본 타입의 선언 (리터럴) Stack의 영역에 올라감
		Integer i = n; // 참조 타입의 대입 AutoBoxing Heap의 영역에 올라감
		Object objTo = n; // 기본타입(리터럴)을 -> 참조타입으로 변환(AutoBoxing) -> up Casting
		Object obj = i; // upCasting
		
//		int m = obj + 1; // 참조타입과 기본타입은 연산대상이 되지 않는다.
						/*
						 * obj의 원래태인 Integer로 변해서 연산을 위해 int로 변환을 자동으로 해주지 않는다.
						 */
		int m = (Integer)obj + 1; // 참조타입인 obj를 downcasting하고 Integer -> int로 AutoUnBoxing - > 연산
		/*----------------------------------------------------------- */
		// 참조타입인 Integer를 참조타입인 Long로 변경해 보자.
		Integer p = 200;
		Long q = (long)((Integer)(Object)p+1);
		Long l = p.longValue()+1;
		
		int mm = 10;
		Long ll = (long)mm; // 기본타입의 promotion과 AutoBoxing을 사용한 참조타입 변환
		
	}
}
