package com.exam.magicsquare;

public abstract class MagicSquareImpl implements IMagicSquare {

	protected int[][] magic;

	public MagicSquareImpl(int n) {
		magic = new int[n][n];
	}

	@Override
	public abstract void makeMagic();

	@Override
	public void print() {
		int n = magic.length;

		String result = magicCheck() ? "성공" : "실패";
		System.out.println(n + "의 마방진 결과는 ? " + result);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d\t", magic[i][j]);
			}
			System.out.printf("%d\n", sumRow(i));
		}
		System.out.println();
		for (int i = 0; i < magic.length; i++) {
			System.out.printf("%d\t", sumCol(i));
		}
		System.out.printf("%d\t", sumDiagonal());
		System.out.println(sumReverDiagonal());
	}

	// sumRow, sumCol, sumDia, sumReversDia을 실행하여 같은 값을 가지고 있는지 확인
	/**
	 * @return boolean true면 성공 false면 실패
	 */
	private boolean magicCheck() {
		boolean isc = true;
		int n = magic.length;
		// 각 항목을 담을 수 있는 배열을 만든다.
		int[] checked = new int[2 * n + 2];

		for (int i = 0; i < n; i++) {
			checked[i] = sumRow(i);
			checked[n + i] = sumCol(i);
		}
		checked[2 * n] = sumDiagonal();
		checked[2 * n + 1] = sumReverDiagonal();
		for (int i = 1; i < checked.length; i++) {
			if (checked[0] != checked[i]) {
				isc = false; // true면 마방진 실패
			}
		}
		;
		return isc;
	}

	// 가로, 세로, 대각선, 역대각선 합 구하는 메소드
	private int sumRow(int row) {
		int sum = 0;
		for (int i = 0; i < magic.length; i++) {
			sum += magic[row][i];
		}
		return sum;
	}

	private int sumCol(int col) {
		int sum = 0;
		for (int i = 0; i < magic.length; i++) {
			sum += magic[i][col];
		}
		return sum;
	}

	private int sumDiagonal() {
		int sum = 0;
		for (int i = 0; i < magic.length; i++) {
			sum += magic[i][i];
		}
		return sum;
	}

	private int sumReverDiagonal() {
		int sum = 0;
		for (int i = 0; i < magic.length; i++) { // 02, 11 ,20
			sum += magic[i][magic.length - 1 - i];
		}
		return sum;
	}

}
