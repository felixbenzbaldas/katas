package katas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
				return toCardsString(card1, card2);
			}
		}
		return null;
	}

	private String toCardsString(Card... cards) {
		String toReturn = cards[0].cardString;
		for (int i = 1; i < 2; i++) {
			toReturn += " " + cards[i].cardString;
		}
		return toReturn;
	}

}
