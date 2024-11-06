package com.min.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LottoMake {
	private List<LottoNum> lottoRow;

	public List<LottoNum> getLottoRow() {
		return lottoRow;
	}

	public LottoMake() {
		lottoRow = new ArrayList<>();
		make();
	}

	private void make() {
		int cnt = 0;
		while (true) {
			LottoNum num = new LottoNum();
			if (!lottoRow.contains(num)) {
				lottoRow.add(num);
				cnt++;
			}
			if (cnt == 6) {
				break;
			}
		}	
	}

	@Override
	public int hashCode() {
		return Objects.hash(lottoRow);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LottoMake other = (LottoMake) obj;
		return Objects.equals(lottoRow, other.lottoRow);
	}

	
}
