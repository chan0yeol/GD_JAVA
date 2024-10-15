package com.example.edu;

// TODO 002 대입연산자
public class Assignment_Operators {
	int instance_i;

	public void assignment() {
		/*
		 * int a,b,c=0; => int a; int b; int c=10; 와 같다.
		 */
		// 일반적인 대입(=) 연산
		int i; // 선언, 멤버필드(instance_i)는 instance를 생성할때 해당 타입으로 초기화, 지역변수(i)는 대입하기전에 초기화되지 않는다.
		i = 1; // 대입

		// 단축연산
		// 변수의 등비값을 입력할 때, 자신의 변수에 다시 연산을 통해서 새로운 값을 입력할 때 사용할 수 있다.
		// ** 반드시 연산자는 = 왼쪽에 있어야 한다.

		i += 5; // i = i+5;
		i -= 5; // i = i-5;
		i *= 5; // i = i*5;
		i /= 5; // i = i/5;
		i %= 5; // i = i%5;
	} // assignment end

	public void in_decrement() {
		// 변수의 값을 1씩 증가(++), 감소 (--)
		// 증감연산자는 변수 앞 혹은 뒤에 선언됨에 따라 연산의 결과가 달라진다.
		// i++ 선처리 후증감 , ++i 선증감 후처리
		
		int y = 100;
		System.out.println("++y : "+ ++y); // y = 101
		System.out.println("--y : "+ --y); // y = 100
		System.out.println("y++" + y++); // y = 100
		System.out.println("y--" + y--); // y = 101
		System.out.println("y" + y); // y = 100
		
		int m,n;
		m=5;
		n = m++;
		System.out.println(m + "/" + n);
		m=5;
		n=++m;
		System.out.println(m + "/" + n);
	
	}
}
