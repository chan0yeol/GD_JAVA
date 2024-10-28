package com.example.edu.review;

import com.util.edu.EducationUtility;

public class TriangleReviewMain {

	public static void main(String[] args) {
		TriangleReview tr = new TriangleReview();
		int stage = EducationUtility.getNumericValue();
		
//		tr.triangle_01(stage);
		tr.triangleTwo(stage);
	}

}
