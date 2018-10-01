package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSimplePokerHands {

	@Test
	public void findHandUnsortedCards() {
		testExpectedForCards("K7", "K4 K7 K6");
	}
	
	@Test
	public void findHand_images() {
		testExpectedForCards("KD", "K4 KD K6");
	}
	
	@Test
	public void findHand_imagesAndAs() {
		testExpectedForCards("CA", "K4 KD K6 CA CB");
	}
	
	@Test
	public void findHand_multiColors() {
		testExpectedForCards("C8", "C8 K2");
	}

	@Test
	public void findHand_ten() {
		testExpectedForCards("K10", "K4 K10 K6");
	}
	
	@Test
	public void findPair() {
		testExpectedForCards("K5 C5", "K5 C5 K8");
	}
	
	@Test
	public void findPair_twoPairs() {
		testExpectedForCards("K5 C5", "K5 C2 K2 C5 K9");
	}

	private void testExpectedForCards(String expected, String actual) {
		assertEquals(expected, findHand(actual));
	}

	private String findHand(String cardsString) {
		return new SimplePokerHands().findHand(cardsString);
	}
}
