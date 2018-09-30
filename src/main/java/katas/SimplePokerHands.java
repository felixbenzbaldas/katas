package katas;

import java.util.Arrays;

public class SimplePokerHands {

	public String findHand(String cardsString) {
		Card[] cardsArray = transformToCardArray(cardsString);
		Arrays.sort(cardsArray);
		String pair = findHighestPairInSortedCards(cardsArray);
		if (pair == null) {
			return cardsArray[cardsArray.length - 1].cardString;
		} else {
			return pair;
		}
	}
	
	private Card[] transformToCardArray(String cardsString) {
		return transform(cardsString.split(" "));
	}

	private Card[] transform(String[] cardStringArray) {
		Card[] cardArray = new Card[cardStringArray.length];
		for (int i = 0; i < cardStringArray.length; i++) {
			cardArray[i] = new Card(cardStringArray[i]);
		}
		return cardArray;
	}

	private String findHighestPairInSortedCards(Card[] sortedCards) {
		for (int i = sortedCards.length - 1; i > 0; i--) {
			Card card1 = sortedCards[i - 1];
			Card card2 = sortedCards[i];
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
