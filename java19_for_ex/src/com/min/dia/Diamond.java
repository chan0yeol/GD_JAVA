package com.min.dia;

public class Diamond {
	public void diamond(int stage) {
		increase(stage);
		decrease(stage);
	}

	public void sandClock(int stage) {
		decrease(stage);
		increase(stage);

	}

	private void increase(int stage) {
		for (int i = 0; i < stage; i++) {
			for (int j = 0; j < (stage - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i + 1); j++) {
				System.out.print("@");
			}
			System.out.println();

		}
	}// increase end

	private void decrease(int stage) {
		for (int i = 0; i < stage; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (stage - i) - 1; j++) {
				System.out.print("@");
			}

			System.out.println();
		}
	} // decrease end
}
