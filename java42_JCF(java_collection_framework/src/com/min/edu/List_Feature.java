package com.min.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Feature {
	/*
	 * JCF는 각 인터페이스를 구현한 자식클래스를 사용하여 작성해야 한다. <T> T는 Type을 나타내는 Generic <E> Element
	 * <N> Number <V> Value <K> Key S, U, V - 2nd 3nd 4nd
	 */
	public void list_check() {
		// Generic에 의해서 정수형 int의 wrapper클래스인 Integer만 들어갈 수 있다.
		// 호출 할 때는 Integer 자동 캐스팅되어 사용된다.
		List<Integer> lists = new ArrayList<Integer>();
		int n1 = 20, n2 = 30, n3 = 40;
		lists.add(n1); // 입력
		lists.add(n2);
		lists.add(n3);
		System.out.println(lists); // 출력
//		lists.remove(1); // 삭제
		// remove 사용할때 정수를 입력하면 index인식
		Integer in3 = 40;
//		int remove01 = lists.remove(n3);
		// 입력되는 참조타입으로 입력되는 List를 포함하고 있는 객체로 찾게됨
		// *** 객체로 삭제하면 삭제되었다면 true/false
		boolean remove01 = lists.remove((Integer) 40);
		System.out.println("참조타입 객체 삭제 확인 " + remove01 + "./.");
		// int 혹은 정수리터럴 값을 입력하면 index로 처리
		// 삭제된 index의 값을 반환
		// 만약 index가 없을 경우는 IndexOutOfBoundException을 발생시킨다.
		Integer i = lists.remove(0);
		/*
		 * 1) 기본타입 int는 index로 인식 2) 참조타입 Integer같은 Wrapper Class는 Object로 인식한다. 20-21번의
		 * 줄의 값을 add() 할때는 Boxing 자동 처리되어 Integer로 변경된다
		 */
		System.out.println("index의 해당 index값 삭제 : " + i);

		List<String> list = new ArrayList<String>();
		list.add("asd");
		list.add("asd");
//		list.add(1, "asd");
//		list.remove(0);
		System.out.println("hashcode");
		System.out.println(list.get(0).hashCode());
		System.out.println(list.get(1).hashCode());
		for (Integer integer : lists) {
			System.out.println(integer);
		}

		for (int intvalue : lists) { // autoUnBoxing 발생

		}

		List list2 = new ArrayList();
		for (Object object : list2) {

		}
	} // list _chekc() end ------

	public void list_iterator() {
		//출력 
		// get(int index) 출력
		// 향상된 for문(foreach) for(T t : lists)
		// iterator 객체 사용
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("C"); //같은 값이지만 List는 자동으로 index를 증가시키고 값을 입력
		
		System.out.println("list의 크기 : " + list.size());
		list.remove(1);
		System.out.println("1번 index의 값 : " + list.get(1));
		
		boolean isc = list.contains("B");
		System.out.println("B의 객체 있냐?" + isc);
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println("for문 : " + list.get(i));
		}
		for (String string : list) {
			System.out.println("foreach : "+string);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("Iterator방식 : " + iter.next());
		}
	} // list_iterator() end --- -
	
	public void list_contains() {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			list.add(i*10);
			
		}
		boolean isc = list.contains(20);
		System.out.println(isc);
		
		System.out.println(list.size());
		// 객체를 그대로 유지시키고 pass by reference인 객체를 모두 비워버린다
		list.clear();
		System.out.println(list.size()); // => 0으로 출력
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
//		list.set(0, 15);
		list.add(0,10);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//constains 는 해당 객체를 가지고 있는지 확인
		//indexOf는 해당 객체를 가지고 있는 index를 반환
		int idx = list.indexOf(400);
		System.out.println("400 정수를 갖고 있는 idx : " + idx );
		
		
		// toArray => array로 변경
		System.out.println("0-----------------------0");
		Object[] toArr = list.toArray();
		for(int i = 0; i<toArr.length;i++) {
			System.out.println(toArr[i]);
		}
		
		// Array T[] -> ArrayList'
		System.out.println("----------------------");
		String[] strs = {"java","html","db","css"};
		List<String> strlist = new ArrayList<String>(Arrays.asList(strs));
		System.out.println(strlist);
		
		
		// list.subList
		// subList(start, end-1)
		// 잘라내기가 아닌 복제
		List<String> strcopy = strlist.subList(0, 1);
		System.out.println(strcopy);
		System.out.println(strs);
		
		//add에서 인덱스 넣었을때? 
		
	}
}
