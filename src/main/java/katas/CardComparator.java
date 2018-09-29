package katas;

import java.util.Comparator;

public class CardComparator implements Comparator<String> {
	public int compare(String card1, String card2) {
		return compareValues(card1, card2);
	}

	public static int compareValues(String card1, String card2) {
		return getSortValue(card1).compareTo(getSortValue(card2));
	}
	
	public static boolean valueEquals(String card1, String card2) {
		return compareValues(card1, card2) == 0;
	}

	public static Integer getSortValue(String card) {
		Card cardObject = new Card();
		cardObject.cardString = card;
		String cardValue = getValue(cardObject);
		if (cardValue.equals("B")) {
			return 11;
		}
		if (cardValue.equals("D")) {
			return 12;
		}
		if (cardValue.equals("K")) {
			return 13;
		}
		if (cardValue.equals("A")) {
			return 14;
		}
		return Integer.valueOf(cardValue);
	}
	
	public static String getValue(Card card) {
		return card.cardString.substring(1);
	}
}