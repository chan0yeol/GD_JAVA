package com.min.edu.main;

import java.util.Calendar;
import java.util.Scanner;

import com.min.edu.H2O;
import com.min.edu.pattern.ChoiceFactory;

public class H2OMain {

	public static void main(String[] args) {
		// TODO 003 001과 002를 통해서 작성된 Ice, Steam, Water의 각 객체를 생성하여
//		make(), print() 실행해보자
//		Ice ice = new Ice();
//		Steam steam = new Steam();
//		Water water = new Water();
//		
//		ice.make();
//		ice.print();
//		
//		steam.make();
//		steam.print();
//		
//		water.make();
//		water.print();
		
		// TODO 004 만들어진 객체의 상위 부모로 타입을 up casting
		/*
	   			up casting 된 부모의 메소드를 각 자식 클래스(Ice,Steam,Water)가 오버라이드 하고 있다.
				생성된 객체는 다르지 않고 같은 타입의 부모타입으로 메소드를 실행시킨다면
				자동으로 해당 객체가 선택되어 실행됨(VMI)
		 */
		
//		H2O hi = new Ice();
//		H2O hs = new Steam();
//		H2O hw = new Water();
//		
		// 실행되는 make와 print를 하나의 객체로 실행 시킬 수 있다.
//		H2O hOne = new Ice();
//		hOne = new Steam();
//		hOne = new Water();
//		
//		hOne.make(); // 객체의 메소드가 아닌 H2O의 메소드만 보인다.
//		hOne.print();
		// TODO 005 만약에 H2OImpl에 있는 멤버필드를 사용하고 싶다면
		/*
		 		현재의 H2O의 멤버들만 보이기 때문에 사용할 수 없게 된다.
		 		따라서 생성된 객체가 H2OImpl 된다면 make,print,num도 사용할 수 있다.
		 		최상위의 interface로 Up Casting을 하는게 아니라 num을 가지고 있는 H2OImple로 Down Casting 하여 사용
		 */
//		H2OImpl h2oImpl = (H2OImpl)hOne;
//		h2oImpl.num = 10;
//		h2oImpl.make();
//		h2oImpl.print();
		
		// TODO 007 참조타입의 형변환을 사용해서 하나의 객체가 반환되는 ChoiceFactory를 사용한다.
		
		for (int i = 0; i < 3; i++) {
			
//			ChoiceFactory factory = new ChoiceFactory(); 
			ChoiceFactory factory = ChoiceFactory.getInstance(); // Single-ton으로 변경
			H2O h2o = null;
			Scanner scan = new Scanner(System.in);
			System.out.println("선택 숫자 1 ~ 3");
			int ch = scan.nextInt();
			h2o = factory.factory(ch);
			h2o.make(); // 부모를 통해서 생성된 해당 객체를 실행하는 VMI
			h2o.print();
		}// for end
		System.out.println("객체 생성 횟수 : "+ChoiceFactory.cnt);
	}
}
