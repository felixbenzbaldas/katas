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

	private String findHand(String cardsString) {
		return new SimplePokerHands().findHand(cardsString);
	}
}
