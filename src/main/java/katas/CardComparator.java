package katas;

import java.util.Comparator;

public class CardComparator implements Comparator<String> {
	public int compare(String card1, String card2) {
		return getSortValue(card1).compareTo(getSortValue(card2));
	}

	public String getValue(String card) {
		return card.substring(1);
	}

	public Integer getSortValue(String cardValue) {
		if (cardValue.equals("B")) {
			return 11;
		}
		return Integer.valueOf(getValue(cardValue));
	}
}