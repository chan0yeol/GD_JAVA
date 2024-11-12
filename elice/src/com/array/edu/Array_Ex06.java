package com.array.edu;

import java.util.Arrays;

public class Array_Ex06 {
	public static void main(String args[]) {
	     int[][] score = { 
	         {90,80,70},
	         {95,85,75},
	         {70,80,75},
	         {75,70,85},
	         {70,75,80}  }; 
//	     int[][] copy = new int[score.length+1][score[0].length+1];
	     int[][] copy = new int[6][4];
	     for(int i=0; i<score.length; i++) {
	    	 System.arraycopy(score[i], 0, copy[i], 0, 3);
//	    	 copy[i][3] = copy[i][]+cop;
	    	 for(int j=0; j<3;j++) {
	    		 copy[i][3] += copy[i][j];
	    	 }
//	    	 System.out.println(Arrays.toString(copy[i]));	 
	     }
	     for(int i =0; i<5; i++) {
	    	 for(int j = 0; j<4;j++) {
	    		 copy[5][j] += copy[i][j];	 
	    	 }
	    	 
	     }
	     for(int i = 0; i<copy.length; i++) {
	    	 for(int j=0; j<copy[i].length;j++) {
	    		 System.out.print(copy[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }
//	     System.out.println(Arrays.toString(copy[5]));
	     
//	     copy[5][0] = +copy[1][0]+copy[2][0]+copy[3][0]
//	     for(int i = 0; i<5; i++) {
//	    	  copy[i][1] = 1;
//	     }
	 }
}
