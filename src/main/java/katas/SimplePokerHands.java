package katas;

public class SimplePokerHands {

	public String findHand(String cardsString) {
		Card[] cardsArray = transformToCardArray(cardsString);
		return toCardsString(new SimplePokerHandsLogic().findHand(cardsArray));
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
	
	private String toCardsString(Card[] cards) {
		String toReturn = cards[0].toString();
		for (int i = 1; i < cards.length; i++) {
			toReturn += " " + cards[i];
		}
		return toReturn;
	}
}
