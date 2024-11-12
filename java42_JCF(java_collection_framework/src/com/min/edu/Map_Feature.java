package com.min.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Feature {
	/*
	 * key와 value를 동시에 입력해야 한다.
	 * key는 중복 X
	 * value는 중복 O
	 * key가 중복이 되면 마지막에 입력된 값이 입력된다.
	 */
	
	public void map_check() {
		Map<String, Integer> map  = new HashMap<String,Integer>();
		map.put("가", 10);
		map.put("나", 20);
		map.put("다", 30);
		map.put("다", 99);
		System.out.println(map);
	}// map_check() end
	
	public void map_fn() {
		Map<String, Integer> map  = new HashMap<String,Integer>();
		map.put("가", 10);
		map.put("나", 20);
		map.put("다", 30);
		map.put("라", 40);
		map.put("마", 55);
//		System.out.println(map);
		
		// key만으로 값을 출력 할 수 있다.
		// map.get(key or key객체)
		// "key를 모르면 절대 값을 추출할 수 없다."
		String searchKey = "가";
		Integer retrunValue = map.get(searchKey);
		System.out.println(retrunValue);
		
		
		// 삭제는 ?
		String rms = "10";
		Integer rmi = 10;
		
		// key로만 map의 객체를 삭제 가능하다.
		// key를 통해 삭제 할 때 해당 key가 없다면 "null을 반환한다"
		// 삭제 하는 key가 있다면 해당 value를 return하고 삭제된다.
		// => 삭제 여부를 판단하기 위해서 null의 여부를 판단하면 된다.
		// => ex) (rmFormValue != null)?"삭제":"삭제대상X";
		Integer rmFormValue = map.remove(rms);
		System.out.println(rmFormValue);
		
		Integer rmValue = map.remove("다");
		System.out.println("\"다\" 키의 삭제후 반환 값 :" + rmValue);
		
		// remove(key,value) => 반환타입 boolean
		boolean bool = map.remove("마", 55);
		String chkMsg = bool?"삭제 O":"삭제 X";
		System.out.println(chkMsg); 
		System.out.println(map);
		
		/*-------------출력-----------------*/
		// 1) map을 Entry 타입으로 변경하여 하나의 객체로 만들어 준 후 get을 통해서 key와 value를 출력
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + ":" + val);
		}
		
		// 2) iterator를 사용하여 출력
		// 	  key만을 추철해서 Set의 형태로 만들고 -> Iterator로 만들고 -> 출력되는 iterator를 get(key)하여 출력
		Set<String> keys = map.keySet(); // map의 key만을 추출하여 Set 객체로 만들어 준다.
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer tmp = map.get(key);
			System.out.printf("키는 %s : 값은 %d \n", key, tmp);
		}
	
		
		
		
		
		
		
		
		
	}
}
