package katas;

import java.util.Comparator;

public class CardComparator implements Comparator<String> {
	public int compare(String card1, String card2) {
		return compareValues(card1, card2);
	}

	public static int compareValues(String card1, String card2) {
		return getSortValue(card1).compareTo(getSortValue(card2));
	}

	public static Integer getSortValue(String card) {
		String cardValue = getValue(card);
		if (cardValue.equals("B")) {
			return 11;
		}
		if (cardValue.equals("D")) {
			return 12;
		}
		return Integer.valueOf(cardValue);
	}
	
	public static String getValue(String card) {
		return card.substring(1);
	}
	
}