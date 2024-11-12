package com.exam.magicsquare;

public class EvenMagicSquare extends MagicSquareImpl{
//	private int[][] magic;

	public EvenMagicSquare() {
		this(4);
	}

	public EvenMagicSquare(int n) {
		super(n);
	}

	@Override
	public void makeMagic() {
		makeA();
		makeB();
	}

	private void makeA() {
		int n = magic.length;
		for (int i = 0; i < n * n; i++) {
			magic[i / n][i % n] = i + 1;
		}
	}  

	private void makeB() {
		int n = magic.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= 0 && i < n / 4 || i >= n / 4 * 3 && i < n) {
					if (j >= n / 4 && j < n / 4 * 3) {
						magic[i][j] = n * n - (i * n + j);
					}
				} else if (j >= 0 && j < n / 4 || j >= n / 4 * 3 && j < n) {
					magic[i][j] = n * n - (i * n + j);
				}
			} // for end
		} // for end
	}// makeB() end



}
