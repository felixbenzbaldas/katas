package katas;

import java.util.Arrays;

public class SimplePokerHands {
	
	public String findHand(String cardsString) {
		String[] sortedCards = cardsString.split(" ");
		String pair = findHighestPairInCards(sortedCards);
		if (pair == null) {
			Arrays.sort(sortedCards, new CardComparator());
			return sortedCards[sortedCards.length - 1];
		} else {
			return pair;
		}
	}
	
	private String findHighestPairInCards(String[] sortedCards) {
		for (int i = sortedCards.length - 1; i > 0; i--) {
			String card1 = sortedCards[i - 1];
			String card2 = sortedCards[i];
			if (CardComparator.valueEquals(card1, card2)) {
				return makeHandOfCards(card1, card2);
			}
		}
		return null;
	}
	
	
	private String makeHandOfCards(String card1, String card2) {
		return card1 + " " + card2;
	}
}
