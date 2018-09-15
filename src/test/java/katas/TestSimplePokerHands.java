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
		assertEquals("K5", findHand("K4 K5"));
	}
	
	public String findHand(String cards) {
		return "K5";
	}
}
