package katas;

import java.util.Comparator;

public class CardComparator implements Comparator<String> {
	public int compare(String card1, String card2) {
		return getValue(card1).compareTo(getValue(card2));
	}

	public Integer getValue(String card) {
		return Integer.valueOf(card.substring(1));
	}
}
