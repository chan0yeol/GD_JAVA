package com.min.edu.pattern;

import com.min.edu.H2O;
import com.min.edu.sub.Ice;
import com.min.edu.sub.Steam;
import com.min.edu.sub.Water;

public class ChoiceFactory {

	
	public static int cnt = 0;
	
	// TODO 008 객체가 생성된다는 것은 외부에서 new 생성자()를 할 수 있다는 것이다.
	/*
	 * 외부에서 new가 되지 않도록 한다.
	 * 내부에서 메모리를 확인하여 객체가 생성되어진 경우는 해당 주소를 넘겨주고, 만들어진 객체가
	 * 메모리에 없다면 내부에서 new를 해서 넘겨주겠다.
	 */
	
	private static ChoiceFactory factory;
	
	private ChoiceFactory() {
		cnt++;
	}
	
	public static ChoiceFactory getInstance() {
		if(factory == null) {
			factory = new ChoiceFactory();
		}
		
		return factory;
	}
	// TODO 006 키보드(Scanner)로 입력받아 해당 입력 숫자에 맞는 객체를 생성(new)하고
	/*
	 * 메소드는 반드시 하나의 객체이거나 하나의 반환 타입이어야 한다.
	 * Ice,Steam,Water의 객체를 모두 Up Casting하고 멤버를 사용할 수 있는 H2OImpl 을 사용한다.
	 * 
	 */
	public H2O factory(int n) {
		H2O tmp = null;
		switch (n) {
		case 1:
			tmp = new Ice();
			break;
		case 2:
			tmp = new Steam();
			break;
		case 3: 
			tmp = new Water();	
			break;
		}
		return tmp;
	}
}
