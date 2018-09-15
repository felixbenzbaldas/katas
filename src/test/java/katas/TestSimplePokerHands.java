package katas;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TestSimplePokerHands {

	@Test
	public void findHandUnortedCards() {
		assertEquals("K7", findHand("K4 K7 K6"));
	}
	
	@Test
	public void findHand_images() {
		assertEquals("KD", findHand("K4 KD K6"));
	}
	
	@Test
	public void findHand_multiColors() {
		assertEquals("C8", findHand("C8 K2"));
	}

	@Test
	public void findHand_ten() {
		assertEquals("K10", findHand("K4 K10 K6"));
	}
	
	
	@Test
	public void findPair() {
		assertEquals("K5 C5", findHand("K5 C5"));
	}
	
	public String findHand(String cardsString) {
		String[] sortedCards = cardsString.split(" ");
		String pair = findPairInCards(sortedCards);
		if (pair == null) {
			Arrays.sort(sortedCards, new CardComparator());
			return sortedCards[sortedCards.length - 1];
		} else {
			return pair;
		}
	}
	
	private String findPairInCards(String[] sortedCards) {
		String card1 = sortedCards[0];
		String card2 = sortedCards[1];
		if (CardComparator.compareValues(card1, card2) == 0) {
			return makeHandOfCards(card1, card2);
		} else {
			return null;
		}
	}
	
	private String makeHandOfCards(String card1, String card2) {
		return card1 + " " + card2;
	}
}
