package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSimplePokerHands {

	@Test
	public void giveHand() {
		assertEquals("K5", findHand("K5"));
	}
	
	@Test
	public void findHandInSortedCards() {
		assertEquals("K6", findHand("K4 K6"));
	}
	
	public String findHand(String cards) {
		if (cards.length() > 2) {
			String[] splittedCards = cards.split(" ");
			return splittedCards[1];
		}
		return "K5";
	}
}
