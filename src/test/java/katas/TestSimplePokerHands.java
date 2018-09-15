package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSimplePokerHands {

	@Test
	public void findHandUnortedCards() {
		testExpectedActual("K7", "K4 K7 K6");
	}
	
	@Test
	public void findHand_images() {
		testExpectedActual("KD", "K4 KD K6");
	}
	
	@Test
	public void findHand_multiColors() {
		testExpectedActual("C8", "C8 K2");
	}

	@Test
	public void findHand_ten() {
		testExpectedActual("K10", "K4 K10 K6");
	}
	
	
	@Test
	public void findPair() {
		testExpectedActual("K5 C5", "K5 C5");
	}

	private void testExpectedActual(String expected, String actual) {
		assertEquals(expected, findHand(actual));
	}

	private String findHand(String cardsString) {
		return new SimplePokerHands().findHand(cardsString);
	}
}
