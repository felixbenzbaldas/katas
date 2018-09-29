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
			Card card1 = new Card(sortedCards[i - 1]);
			Card card2 = new Card(sortedCards[i]);
			if (card1.getValue().equals(card2.getValue())) {
				return toCards(card1, card2);
			}
		}
		return null;
	}
	
	
	private String toCards(Card card1, Card card2) {
		return card1.cardString + " " + card2.cardString;
	}
}
