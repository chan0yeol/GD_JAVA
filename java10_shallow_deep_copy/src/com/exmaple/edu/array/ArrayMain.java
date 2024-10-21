package com.exmaple.edu.array;

import com.example.edu.review.ChangeInfo;

public class ArrayMain {
	public static void main(String[] args) {
		Shallow_Deep sd = new Shallow_Deep();
//		sd.shallow();
		sd.deep();
		System.arraycopy(args, 0, sd, 0, 0);
		
	}
}

