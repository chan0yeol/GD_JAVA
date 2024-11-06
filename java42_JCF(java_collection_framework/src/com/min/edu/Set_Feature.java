package com.min.edu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Feature {

	public void set_check() {
		Set<String> sets = new HashSet<String>();

		String a = "가", b = "나", c = "다";
		String d = new String("다");

		System.out.println("hashCode()");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());

		System.out.println("System.identityHashCode(obj)");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));

		sets.add(a);
		sets.add(b);
		sets.add(c);
		sets.add(d);

		System.out.println(sets); // [가, 다, 나]

		for (String string : sets) {
			System.out.println(string + ":" + System.identityHashCode(string));
		}
		/* --------------------------------------------------------------- */
		// 객체의 Override된 최종 객체의 hashcode로 비교 판단한다.
		boolean bool = sets.contains(c); // c는 리터럴 값
		System.out.println(bool);
		boolean bool2 = sets.contains(d); // new 로 생성된 String
		System.out.println(bool2);
		
		/* --------------------------------------------------------------- */
		// 향상된 for문을 통해서 출력이 가능하다.
		// Iterator를 통해서 출력한다.
		// 이터레이터 패턴 : 객체에 있는 객체를 모두 출력을 하는데 단 1번만 가능
		Iterator<String> iter = sets.iterator();
		while(iter.hasNext()) { // 객체 판단
			System.out.println(iter.next()); // 해당 객체 출력
		}
		/*
		 * 	
		 * 
		 */
	}
	
	public void set_array() {
		Set<String> sets = new HashSet<String>();
		String a = "가", b = "나", c = "다";
		String d = new String("다");
		sets.add(a);
		sets.add(b);
		sets.add(c);
		
		sets.remove(d); // contains와 같이 hashcode로 삭제한다.
		
		System.out.println(sets);
		System.out.println(sets.contains("다"));
		
		/* toArray()는 무조건 Object[]로 반환한다. */
		Object[] strArr = sets.toArray();
		System.out.println(Arrays.toString(strArr));
		
		/*사용할 때 down casting을 통해 사용해야 한다.*/
		for (Object object : strArr) {
			System.out.println((String)object);
		}
		for(int i = 0; i<strArr.length;i++) {
			System.out.println((String)strArr[i]);
		}
		
	}
}
