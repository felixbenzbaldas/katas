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

	public String findHand(String cards) {
		String[] splittedCards = cards.split(" ");
		Arrays.sort(splittedCards);
		Comparator<String> cardComparator = new Comparator<String>() {

			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		return splittedCards[splittedCards.length - 1];
	}
	
	public String getValue(String card) {
		return card.substring(1);
	}
	
	
}
