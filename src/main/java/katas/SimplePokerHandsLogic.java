package katas;

import java.util.Arrays;

public class SimplePokerHandsLogic {

	public Card[] findHand(Card[] cards) {
		Arrays.sort(cards);
		Card[] hand = findHighestPairInSortedCards(cards);
		if (hand == null) {
			hand = new Card[] { cards[cards.length - 1] };
		}
		return hand;
	}

	private Card[] findHighestPairInSortedCards(Card[] sortedCards) {
		for (int i = sortedCards.length - 1; i > 0; i--) {
			Card card1 = sortedCards[i - 1];
			Card card2 = sortedCards[i];
			if (card1.getValue().equals(card2.getValue())) {
				return new Card[] { card1, card2 };
			}
		}
		return null;
	}
}
