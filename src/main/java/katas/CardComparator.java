package katas;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
	
	public int compare(Card card1, Card card2) {
		return compareValues(card1, card2);
	}

	private static int compareValues(Card card1, Card card2) {
		return getSortValue(card1).compareTo(getSortValue(card2));
	}
	
	private static Integer getSortValue(Card card) {
		String cardValue = card.getValue();
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
}