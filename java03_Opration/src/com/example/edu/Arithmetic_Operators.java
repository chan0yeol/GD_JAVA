package com.example.edu;

// TODO 001 수학연산
public class Arithmetic_Operators {
	public void arithmetic() {
		float f = 3 + 2; // 5.0 addition
		f = 3-1; // 1.0 subtraction
		f = 3*2; // 6.0 multiplication
		f = 3*2; // 1.0 division
		f = 3%2; // 1.0 modulus
		System.out.println(f); 
		
	} // arithmetic end
	
	public void divisionSign() {
		// 실수 연산의 경우는 잘못된 결과를 가져오게 된다.
		// 참여하는 연산의 타입에 따라서 결과를 반환한다 
		// ex) 숫자 연산의 결과는 무조건 int 이다. 하지만 참여하는 타입이 long이 포함된다면 long 으로 반환한다.
		//    연산에 실수를 포함하고 있다면 그 결과는 실수 (double, float)가 된다.
		float x1 = 3/2; //1.0
		float x2 = (float) 3/2; // 1.5
		float notOper = (float)(3/2); // 1.0 -> 정수 연산 후 형변환 되기 때문에
		System.out.println(x2);
		float x3 = (float)(3f/10.0); // 연산 후에 다시 float의 크기로 casting(형변환)
		double x4 = 3f/10.0;  // 
	} // divisionSign end
}
