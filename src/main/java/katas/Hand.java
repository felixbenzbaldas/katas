package katas;

import java.util.HashSet;
import java.util.Set;

public class Hand {
	private Set<String> cards;

	public Hand(String card1, String card2) {
		cards = new HashSet<String>();
		cards.add(card1);
		cards.add(card2);
	}
	
}