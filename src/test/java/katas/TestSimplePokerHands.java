package katas;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class TestSimplePokerHands {

	@Test
	public void giveHand() {
		assertEquals("K5", findHand("K5"));
	}
	
	@Test
	public void findHandUnortedCards() {
		assertEquals("K7", findHand("K4 K7 K6"));
	}
	
	@Test
	public void findHand_multiColors() {
		assertEquals("C8", findHand("C8 K2"));
	}

	@Test
	public void findHand_ten() {
		assertEquals("K10", findHand("K4 K10 K6"));
	}
	

	public String findHand(String cards) {
		String[] splittedCards = cards.split(" ");
		Comparator<String> cardComparator = new Comparator<String>() {
			public int compare(String card1, String card2) {
				return getValue(card1).compareTo(getValue(card2));
			}
		};
		Arrays.sort(splittedCards, cardComparator);
		return splittedCards[splittedCards.length - 1];
	}
	
	public Integer getValue(String card) {
		return Integer.valueOf(card.substring(1));
	}
}
