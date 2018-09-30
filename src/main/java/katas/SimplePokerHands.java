package katas;

import java.util.Arrays;

public class SimplePokerHands {

	public String findHand(String cardsString) {
		Card[] cardsArray = transformToCardArray(cardsString);
		Arrays.sort(cardsArray);
		Card[] handCardsArray = findHighestPairInSortedCards(cardsArray);
		if (handCardsArray == null) {
			handCardsArray = new Card[] {cardsArray[cardsArray.length - 1]};
		}
		return toCardsString(handCardsArray);
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
