package katas;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

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
		String[] splittedCards = cards.split(" ");
		Arrays.sort(splittedCards);
		return splittedCards[splittedCards.length - 1];
	}
}
