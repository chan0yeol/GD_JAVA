package com.min.edu;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LottoMakeMain {
	public static void main(String[] args) {
		// TEST 1 LottoNum 두자리 숫자 생성 확인
		LottoNum one = new LottoNum();
		
		LottoMake lotto = new LottoMake();
		List<LottoNum> row = lotto.getLottoRow();
		Collections.sort(row, new Comparator<LottoNum>() {
			@Override
			public int compare(LottoNum o1, LottoNum o2) {
				return Integer.compare(
						Integer.parseInt(
								o1.toString()), Integer.parseInt(o2.toString()));
			};
		});
		System.out.println(lotto.getLottoRow());
	}
}
