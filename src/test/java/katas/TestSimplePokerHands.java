package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSimplePokerHands {

	@Test
	public void giveHand() {
		assertEquals("K5", findHand("K5"));
	}
	
	public String findHand(String cards) {
		return cards;
	}
}
