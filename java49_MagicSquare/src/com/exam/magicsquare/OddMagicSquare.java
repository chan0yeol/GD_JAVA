package com.exam.magicsquare;

public class OddMagicSquare extends MagicSquareImpl {
	// 값이 입력되는 멤버필드
//	private int[][] magic;

	// 생성자
	public OddMagicSquare() {
		this(3); // 생성자 체이닝
	}

	// 생성자 오버로딩
	public OddMagicSquare(int n) {
		super(n);
	}

	// 홀수 마방진 로직에 따른 처리
	/*
	 * 홀수 마방진 3,5,7 등의 홀수 n * n의 2차원 array에 n*n의 숫자가 입력되어 있다. 초기의 값은 1이고 [0,1]에
	 * 위치한다. 입력되는 [x-1,y-1]로 진행된다. [x-1,y-1]로 진행된 곳에 만약 값이 있다면 변하기 전의 값에 [x+1,y]
	 */

	@Override
	public void makeMagic() {
		int n = magic.length; // 세로 갯수
//		int n = magic[0].length; // 가로 갯수

		int x = 0; // 초기 x index
		int y = n/2; // 초기 y index
		magic[x][y] = 1; // 초기값 입력

		for (int i = 2; i <= n * n; i++) { // 각 위치에 입력되는 값 2~n*n 까지
//			입력되는 x-1,y-1로 진행된다.
			int idx = x;
			int idy = y;
			if (x - 1 < 0) x = n - 1;
			else x--;
			
			if (y - 1 < 0) y = n - 1;
			else y--;
			
			if(magic[x][y] != 0) {
				x = idx+1;
				y = idy;
			} 
			magic[x][y] = i;
			
		}
	}
}
