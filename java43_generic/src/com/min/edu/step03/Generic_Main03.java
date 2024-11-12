package com.min.edu.step03;

import com.min.edu.Cat;

public class Generic_Main03 {
	
	// TODO 00402 Generic_Inteface에 의해서 모든 타입을 멤버필드로 작성 할 수 있다.
	public static void main(String[] args) {
		BoxImpl<String> box = new BoxImpl<>();
		box.store("랜드");
		System.out.println(box.getBox());
		
		BoxImpl<Cat> catBox = new BoxImpl<>();
		catBox.store(new Cat());
		catBox.getBox().setCatName("애옹");  
		System.out.println(catBox.getBox().getCatName());
		
		
	}
}
