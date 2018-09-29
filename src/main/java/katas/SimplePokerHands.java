package katas;

import java.util.Arrays;

public class SimplePokerHands {
	
	public String findHand(String cardsString) {
		String[] sortedCards = sortCards(cardsString.split(" "));
		String pair = findHighestPairInSortedCards(sortedCards);
		if (pair == null) {
			return sortedCards[sortedCards.length - 1];
		} else {
			return pair;
		}
	}
	
	private String[] sortCards(String[] cards) {
		Arrays.sort(cards, new CardComparator());
		return cards;
	}
	
	private String findHighestPairInSortedCards(String[] sortedCards) {
		for (int i = sortedCards.length - 1; i > 0; i--) {
			Card card1 = new Card();
			Card card2 = new Card();
			card1.cardString = sortedCards[i - 1];
			card2.cardString = sortedCards[i];
			if (CardComparator.valueEquals(card1, card2)) {
				return makeHandOfCards(card1.cardString, card2.cardString);
			}
		}
		return null;
	}
	
	
	private String makeHandOfCards(String card1, String card2) {
		return card1 + " " + card2;
	}
}
