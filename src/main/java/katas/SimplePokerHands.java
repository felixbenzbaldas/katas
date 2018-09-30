package katas;

import java.util.Arrays;

public class SimplePokerHands {

	public String findHand(String cardsString) {
		Card[] cardsArray = transformToCardArray(cardsString);
		return toCardsString(findHandLogic(cardsArray));
	}

	private Card[] findHandLogic(Card[] cards) {
		Arrays.sort(cards);
		Card[] toReturn = findHighestPairInSortedCards(cards);
		if (toReturn == null) {
			toReturn = new Card[]{cards[cards.length - 1]};
		}
		return toReturn;
	}
	
	private Card[] transformToCardArray(String cardsString) {
		return transformToCardArrayFromStringArray(cardsString.split(" "));
	}

	private Card[] transformToCardArrayFromStringArray(String[] cardStringArray) {
		Card[] cardArray = new Card[cardStringArray.length];
		for (int i = 0; i < cardStringArray.length; i++) {
			cardArray[i] = new Card(cardStringArray[i]);
		}
		return cardArray;
	}

	private Card[] findHighestPairInSortedCards(Card[] sortedCards) {
		for (int i = sortedCards.length - 1; i > 0; i--) {
			Card card1 = sortedCards[i - 1];
			Card card2 = sortedCards[i];
			if (card1.getValue().equals(card2.getValue())) {
				return new Card[] {card1, card2};
			}
		}
		return null;
	}

	private String toCardsString(Card[] cards) {
		String toReturn = cards[0].cardString;
		for (int i = 1; i < cards.length; i++) {
			toReturn += " " + cards[i].cardString;
		}
		return toReturn;
	}
}
