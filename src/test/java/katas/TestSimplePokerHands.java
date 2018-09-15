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
	
	public String findHand(String cards) {
		String[] splittedCards = cards.split(" ");
		String pair = findPairInCards(splittedCards[0], splittedCards[1]);
		if (pair == null) {
			Arrays.sort(splittedCards, new CardComparator());
			return splittedCards[splittedCards.length - 1];
		} else {
			return pair;
		}
	}
	
	private String findPairInCards(String card1, String card2) {
		if (CardComparator.compareValues(card1, card2) == 0) {
			return card1 + " " + card2;
		} else {
			return null;
		}
	}
}
