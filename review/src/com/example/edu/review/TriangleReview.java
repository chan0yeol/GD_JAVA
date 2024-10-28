package com.example.edu.review;

public class TriangleReview {
//11111
//1111
//111
//11
//1
	public void triangle_01(int stage) {
		for (int i = 0; i < stage; i++) {
			for (int j = 0; j < stage - i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

	/*
	 *     @
	 *    @@
	 *   @@@
	 *  @@@@
	 * @@@@@
	 */
	public void triangleTwo(int stage) {
		for (int i = 0; i < stage; i++) {
			for (int j = 0; j < (stage - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
