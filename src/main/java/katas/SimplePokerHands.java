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
				List<Card> cards = new LinkedList<Card>();
				cards.add(card1);
				cards.add(card2);
				return toCardsString(cards);
			}
		}
		return null;
	}

	private String toCardsString(List<Card> listOfCards) {
		String toReturn = listOfCards.get(0).cardString;
		for (int i = 1; i < 2; i++) {
			toReturn += " " + listOfCards.get(i).cardString;
		}
		return toReturn;
	}

}
